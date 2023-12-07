package com.seregsagapitov.autobase.controllers;

import com.seregsagapitov.autobase.entities.Auto;
import com.seregsagapitov.autobase.entities.City;
import com.seregsagapitov.autobase.entities.Trademark;
import com.seregsagapitov.autobase.entities.TypeVagon;
import com.seregsagapitov.autobase.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MainController {


    private AutoService autoService;
    private TradeMarkServise tradeMarkServise;
    private TypeVagonServise typeVagonServise;
    private ModelServise modelServise;
    private CityServise cityServise;


    @Autowired
    public void setCityServise(CityServise cityServise) {
        this.cityServise = cityServise;
    }

    @Autowired
    public void setModelServise(ModelServise modelServise) {
        this.modelServise = modelServise;
    }

    @Autowired
    public void setAutoService(AutoService autoService) {
        this.autoService = autoService;
    }

    @Autowired
    public void setTradeMarkServise(TradeMarkServise tradeMarkServise) {
        this.tradeMarkServise = tradeMarkServise;
    }

    @Autowired
    public void setTypeVagonServise(TypeVagonServise typeVagonServise) {
        this.typeVagonServise = typeVagonServise;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/auto")
    public String showAutoInfo(Model model) {
        model.addAttribute("auto", autoService.getAllAuto());


        return "auto-info";
    }

    @GetMapping("/auto/{id_auto}")
    public String showAutoDetails(Model model, @PathVariable(name = "id_auto") Long id_auto) {
        Auto auto = autoService.getAutoById_auto(id_auto);
        model.addAttribute("auto", auto);
        return "auto-details";
    }

    @GetMapping("/auto/edit/{id_auto}")
    public String addAutoPage(Model model, @PathVariable("id") Long id) {
        Auto auto = autoService.findById(id);
        if (auto == null) {
            auto = new Auto();
        }
        List<Trademark> trademarkList = tradeMarkServise.getAllTrademark();
        List<TypeVagon> typeVagonList = typeVagonServise.getAllTypeVagon();
        List<com.seregsagapitov.autobase.entities.Model> modelList = modelServise.getAllModels();
        List<City> cityList = cityServise.getAllCities();
        model.addAttribute("auto", auto);
        model.addAttribute("trademarkList", trademarkList);
        model.addAttribute("typeVagonList", typeVagonList);
        model.addAttribute("modelList", modelList);
        model.addAttribute("cityList", cityList);
        return "edit-auto";
    }

//    @PostMapping("/auto/edit")
//    public String addAuto(@ModelAttribute("auto") Auto auto, Model model) {
//
////        Auto existing = autoService.findAutoByTrademarkTitle_trademark(auto.getTrademark().getTitle_trademark());
////        if (existing != null && !auto.equals(existing)) {
////            // product.setTitle(null);
////            model.addAttribute("auto", auto);
////            model.addAttribute("productCreationError", "Product title already exists");
//        return "edit-auto";
////        }
//    }

    @GetMapping("/auto/add")
    public String addAutoPage(Model model) {
        Auto auto = new Auto();
        List<City> cityList = cityServise.getAllCities();
        model.addAttribute("auto", auto);
        model.addAttribute("cityList", cityList);
        return "add-auto";
    }

    @PostMapping("/auto/add")
    public String addAuto(Model model, @ModelAttribute("auto") Auto auto) {
        autoService.saveOrUpdate(auto);
        return "redirect:/";
    }


        

}

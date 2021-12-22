package com.seregsagapitov.autobase.controllers;
import com.seregsagapitov.autobase.entities.Auto;
import com.seregsagapitov.autobase.services.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {


    private AutoService autoService;


    @Autowired
    public void setAutoService(AutoService autoService) {
        this.autoService = autoService;
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

    @GetMapping("/auto/add")
    public String addProductPage(Model model) {
        Auto auto = new Auto();
        model.addAttribute("auto", auto);
        return "add-auto";
    }

    @PostMapping("/auto/add")
    public String addProduct(Model model, @ModelAttribute("auto") Auto auto) {
        autoService.saveOrUpdate(auto);
        return "redirect:/";
    }
}

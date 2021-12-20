package com.seregsagapitov.autobase.controllers;
import com.seregsagapitov.autobase.entities.Auto;
import com.seregsagapitov.autobase.services.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

    @Autowired
    private AutoService autoService;

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
}

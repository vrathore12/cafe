package com.example.cafe;

import com.example.cafe.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/")
    public String index(Model model){

        model.addAttribute("coldCoffees", homeService.getColdCoffees());
        model.addAttribute("hotCoffees", homeService.getHotCoffees());
        model.addAttribute("fruitJuices", homeService.getFruitJuices());
        model.addAttribute("specialItems", homeService.getSpecialItems());
        return "index";
    }

    @GetMapping("/cart")
    public String cart(){
        return "cart";
    }
}

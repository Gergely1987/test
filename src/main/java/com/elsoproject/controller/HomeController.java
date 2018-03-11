package com.elsoproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.elsoproject.domain.Product;
import com.elsoproject.domain.ProductsModel;
import com.elsoproject.service.HomeService;

@Controller
public class HomeController {

    private final HomeService hs;

    public HomeController(HomeService hs) {
        this.hs = hs;
    }

    @GetMapping("/index")
    public String stories(Model model) {
        model.addAttribute("pageTitle", "Mi kis webshopunk");
        model.addAttribute("productsModel", new ProductsModel(hs.getProducts()));
        return "index";
    }

    @PostMapping("/index")
    public String sumProducts(Product product, ProductsModel productModel) {
        System.out.println(productModel);
        // TODO do something
        return "result";
    }

}

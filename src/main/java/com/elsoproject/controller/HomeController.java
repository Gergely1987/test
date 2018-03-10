package com.elsoproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.elsoproject.domain.Product;
import com.elsoproject.service.HomeService;

@Controller
public class HomeController {

	HomeService hs=new HomeService();
	
	@RequestMapping("/index")
	public String stories(Model model) {
		model.addAttribute("pageTitle", "Mi kis Webshopunk");
		model.addAttribute("products", hs.getProducts());
		return "index";
	}
	

    @PostMapping("/index")
    public String sumProducts(@ModelAttribute Product products, Model model) {
    	System.out.println("alma");
        model.addAttribute("products", products );
    	return "result";
        
    }
	
}

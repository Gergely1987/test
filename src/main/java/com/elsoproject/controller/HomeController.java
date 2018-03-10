package com.elsoproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.elsoproject.domain.Product;
import com.elsoproject.service.HomeService;

@Controller
public class HomeController {

	HomeService hs = new HomeService();

	// @GetMapping("/index")
	// public String stories(Model model) {
	// Product pr=new Product("szalámi",2000,true);
	// model.addAttribute("pageTitle", "Mi kis Webshopunk");
	// model.addAttribute("product", pr );
	// return "index";
	// }

	@GetMapping("/index")
	public String stories(Model model) {

		model.addAttribute("pageTitle", "Mi kis Webshopunk");
		model.addAttribute("products", hs.getProducts());
		System.out.println(hs.getProducts());
		return "index";
	}

	// @PostMapping("/index")
	// public String sumProducts(@ModelAttribute Product product, Model model) {
	// if(product.getAmount()==null || product.getAmount().isEmpty()) {
	// model.addAttribute("price",0 );
	// } else {
	// model.addAttribute("price", hs.price(product.getAmount())+" Ft" );
	// }
	//
	// return "result";
	//
	// }

	@PostMapping("/index")
	public String sumProducts(@ModelAttribute Product products, Model model) {

		System.out.println(products.toString());
		return "result";

	}

}

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

<<<<<<< HEAD
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
=======
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
>>>>>>> 6c1520c46c8b98ad6692ead61a4a7f33fedfa52d

}

package com.elsoproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.elsoproject.domain.Product;

@Service
public class HomeService {

	public List<Product>getProducts(){
	    List<Product> products =new ArrayList<>();
		
		Product salami=new Product("téliszalámi",2000,false);
		Product rubberDuck=new Product("gumikacsa",3000,false);
		Product cucumber=new Product("uborka",2800,true);
		Product chestnut=new Product("gesztenye",1000,true);
		
		products.add(salami);
		products.add(rubberDuck);
		products.add(cucumber);
		products.add(chestnut);
		
		return products;
	}
	
	public int getSumProducts(List<Product> totalProduct) {
		int sum=0;
		for(Product p:totalProduct) {
			sum+=p.getPrice();
		}
		
		return sum;
	}
	
	public int price (String i) {
	return 	Integer.parseInt(i)*2000;
		
	}
}

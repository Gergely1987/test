package com.elsoproject.domain;

public class Product {

		private String name;
		private int price;
		private boolean megaPack;
		
	   public Product() {
		   
	   }
		
		public Product(String name, int price, boolean megaPack) {
			super();
			this.name = name;
			this.price = price;
			this.megaPack = megaPack;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public boolean isMegaPack() {
			return megaPack;
		}
		public void setMegaPack(boolean megaPack) {
			this.megaPack = megaPack;
		}
		
		
}

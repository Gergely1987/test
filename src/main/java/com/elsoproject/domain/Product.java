package com.elsoproject.domain;

public class Product {

		private String name;
		private int price;
		private boolean megaPack;
		private String amount;
		
	   public Product() {
		   
	   }
		
		public Product(String name, int price, boolean megaPack, String amount) {
			this.name = name;
			this.price = price;
			this.megaPack = megaPack;
			this.amount=amount;
		}
		
		public Product(String name, int price, boolean megaPack) {
			this.name = name;
			this.price = price;
			this.megaPack = megaPack;
			
		}
		
		public String getAmount() {
			return amount;
		}

		public void setAmount(String amount) {
			this.amount = amount;
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

		@Override
		public String toString() {
			return "Product [name=" + name + ", price=" + price + ", megaPack=" + megaPack + ", amount=" + amount + "]";
		}
		
		
}

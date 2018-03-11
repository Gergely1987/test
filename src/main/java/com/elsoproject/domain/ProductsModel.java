package com.elsoproject.domain;

import java.util.List;

public class ProductsModel {
    private  List<Product> products;

    public ProductsModel() {
    }

    public ProductsModel(List<Product> products) {
        this.products = products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "ProductsModel [products=" + products + "]";
    }

}

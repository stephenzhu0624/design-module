package com.example.demo.module.builder;

public class BuilderA extends Builder{

    private Product product = new Product();

    @Override
    Product getResult() {
        return product;
    }

    @Override
    void create() {
        product.put("buildera","buildera");
    }
}

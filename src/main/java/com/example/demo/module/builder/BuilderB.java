package com.example.demo.module.builder;

public class BuilderB extends Builder{

    private Product product = new Product();

    @Override
    Product getResult() {
        return product;
    }

    @Override
    void create() {
        product.put("builderb","builderb");
    }
}

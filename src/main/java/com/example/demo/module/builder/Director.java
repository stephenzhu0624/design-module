package com.example.demo.module.builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
        builder.create();
    }

    public Product build(){
         return builder.getResult();
    }

}

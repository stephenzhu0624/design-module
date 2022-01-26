package com.example.demo.module.factory;

public class CartThree extends Cart{

    int a;
    @Override
    int calculate(int price) {

        return 0;
    }

    public CartThree(int a) {
        this.a = a;
    }
}

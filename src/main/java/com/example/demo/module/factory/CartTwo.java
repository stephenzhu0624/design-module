package com.example.demo.module.factory;

public class CartTwo extends Cart{

    int a;
    int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public CartTwo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    int calculate(int price) {
        return price - price/a*b;
    }
}

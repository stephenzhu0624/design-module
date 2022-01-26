package com.example.demo.module.decorator;

public class DecoratorA extends SimpleDecorator{

    @Override
    void wear() {
        super.wear();
        System.out.println("花裤衩");
    }
}

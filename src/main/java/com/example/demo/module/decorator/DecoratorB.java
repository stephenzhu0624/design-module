package com.example.demo.module.decorator;

public class DecoratorB extends SimpleDecorator{

    @Override
    void wear() {
        super.wear();
        System.out.println("穿衬衫");
    }
}

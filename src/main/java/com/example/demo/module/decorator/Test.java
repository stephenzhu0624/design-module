package com.example.demo.module.decorator;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        SimpleDecorator c = new DecoratorA();
        c.setComponent(person);
        c.wear();
    }
}

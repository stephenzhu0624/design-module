package com.example.demo.module.builder;

public class Client {
    public static void main(String[] args) {

        Builder a = new BuilderA();

        Product build = new Director(a).build();
        System.out.println(build.toString());
        Builder b = new BuilderB();
        Product build2 = new Director(b).build();
        System.out.println(build2.toString());

    }
}

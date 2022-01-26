package com.example.demo.module.factory;

public class SimpleFactory {

    public static Cart createCart(String word){
       switch (word){
           case "one":
               return new CartOne();
           case "two":
               return new CartTwo(100,50);
           case "three":
               return new CartThree(8);
       }
       return null;
    }
}

package com.example.demo.functionInterface;


import java.util.function.Consumer;

public class ConsumerTest  {


    public String firstMethod(String s){
        return s;
    }


    public void accept(Object o) {
        System.out.println("操作1 " + o.toString());;
    }

    public void accept2(Object o ){
        System.out.println("操作2 " + o.toString());;
    }
}

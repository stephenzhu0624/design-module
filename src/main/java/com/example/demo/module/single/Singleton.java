package com.example.demo.module.single;

public class Singleton {
    private static Singleton s ;

    private Singleton() {
    }

    public synchronized Singleton getInstance(){
         if(s != null) {
             s = new Singleton();
         }
        return s ;
    }
}

package com.example.demo.module.strategy;

public class Context {
    SimpleStrategy simpleStrategy;
    void say(String name){
        switch (name){
            case "a":
                simpleStrategy = new StrategyA();
                break;
            case "b":
                simpleStrategy = new StrategyB();
                break;
            case "c":
                simpleStrategy = new StrategyC();
                break;
        }
        simpleStrategy.saysomething();
    }

}

package com.example.demo.module.status;

public class WorkA extends State{
    @Override
    void work(Work w) {
        if(w.time>10){
        System.out.println("工作 啊  啊啊啊啊啊");}

    }
}

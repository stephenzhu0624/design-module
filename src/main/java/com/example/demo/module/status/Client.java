package com.example.demo.module.status;

public class Client {
    public static void main(String[] args) {
        Work w = new Work();
        w.work();
        w.setTime(20);
        w.work();
        w.setTime(6);
        w.work();
    }
}

package com.example.demo.module.builder;

public class Product {
    private String name;
    private String age;
    public void put(String name,String age){
        setName(name);
        setAge(age);
        System.out.println("添加name" + name);
        System.out.println("添加age" + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Product(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

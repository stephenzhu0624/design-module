package com.example.demo.module.metento;

/**
 * 备忘录
 */
public class Player {
    private int blood;
    private int mood;

    public Metento m ;
    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public Metento createMemento(int a,int b){
        m = new Metento(a, b);
        return m;
    }

    public void setM(Metento m) {
        this.m = m;
    }

    public Player() {
    }

    public Player(int blood, int mood) {
        this.blood = blood;
        this.mood = mood;
    }

    public void attack(){
        this.blood = 0;
        this.mood = 0;
        this.setM(new Metento(this.blood,this.mood));
        System.out.println("耗尽了");
    }
    public void getInfo(){
        System.out.println(m.toString());
    }
}

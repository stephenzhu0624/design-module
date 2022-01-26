package com.example.demo.module.metento;

public class CLient {
    public static void main(String[] args) {
        Player player = new Player(100,100);
        MementoTaker t  = new MementoTaker();
        t.setM(player.createMemento(player.getBlood(),player.getMood()));

        player.attack();
        player.getInfo();
        player.setM(t.getM());
        player.getInfo();
    }
}

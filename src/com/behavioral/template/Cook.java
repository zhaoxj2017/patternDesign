package com.behavioral.template;

public abstract class Cook {
    abstract void pourOil();
    abstract void salt();
    abstract void putFood();

    final void cook() {
        pourOil();
        putFood();
        salt();
        fly();
    }

    void fly() {
        System.out.println("翻炒");
    }
}

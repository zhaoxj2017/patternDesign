package com.behavioral.template;

/**
 * @author 赵兴君_F
 */
public abstract class AbstractCook {
    /**
     * pour oil
     */
    abstract void pourOil();

    /**
     * put salt
     */
    abstract void salt();

    /**
     * put food
     */
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

package com.behavioral.template;

public class AbstractCookFish extends AbstractCook {

    @Override
    void pourOil() {
        System.out.println("花生油");
    }

    @Override
    void salt() {
        System.out.println("一小勺盐");
    }

    @Override
    void putFood() {
        System.out.println("鲸鱼");
    }
}

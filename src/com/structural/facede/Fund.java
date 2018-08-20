package com.structural.facede;

public class Fund {
    private Stock1 stock1;
    private Stock2 stock2;
    private Stock3 stock3;
    private NationalDebt debt;

    public Fund() {
        stock1 = new Stock1();
        stock2 = new Stock2();
        stock3 = new Stock3();
        debt = new NationalDebt();
    }

    public void buyA () {
        stock1.buy();
        stock3.buy();
        debt.buy();
    }

    public void sellA() {
        stock1.sell();
        stock3.sell();
        debt.sell();
    }

    public void buyB() {
        stock1.buy();
        stock2.buy();
        stock3.buy();
    }

    public void sellB() {
        stock1.sell();
        stock2.sell();
        stock3.sell();
    }
}

package com.behavioral.strategy.strategy_simply;

public class Player {
    private Double totalAmount = 0D;//客户在鹅厂消费的总额
    private Double amount = 0D;//客户单次消费金额
    private CalPrice calPrice = new Origin();//每个客户都有一个计算价格的策略，初始都是普通计算，即原价

    //客户购买皮肤，就会增加它的总额
    public void buy(Double amount) {
        this.amount = amount;
        totalAmount += amount;
        
        if (totalAmount < 10000) {
        	calPrice = new Origin();
        } else if (totalAmount < 20000) {
        	calPrice = new Vip();
        } else if (totalAmount >= 20000) {
        	calPrice = new SuperVip();
        }
    }

    //计算客户最终要付的钱
    public Double getPayment() {
        return calPrice.calPrice(amount);
    }

    public Double getTotalAmount() {
        return totalAmount;
    }
}
package com.strategyMode.strategySimply;

public class Player {
    private Double totalAmount = 0D;//�ͻ��ڶ쳧���ѵ��ܶ�
    private Double amount = 0D;//�ͻ��������ѽ��
    private CalPrice calPrice = new Orgnic();//ÿ���ͻ�����һ������۸�Ĳ��ԣ���ʼ������ͨ���㣬��ԭ��

    //�ͻ�����Ƥ�����ͻ����������ܶ�
    public void buy(Double amount) {
        this.amount = amount;
        totalAmount += amount;
        
        if (totalAmount < 10000) {
        	calPrice = new Orgnic();
        } else if (totalAmount < 20000) {
        	calPrice = new Vip();
        } else if (totalAmount >= 20000) {
        	calPrice = new SuperVip();
        }
    }

    //����ͻ�����Ҫ����Ǯ
    public Double calLastAmount() {
        return calPrice.calPrice(amount);
    }

    public Double getTotalAmount() {
        return totalAmount;
    }
}
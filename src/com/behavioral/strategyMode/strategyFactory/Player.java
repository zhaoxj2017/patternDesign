package com.behavioral.strategyMode.strategyFactory;

public class Player {
    private Double totalAmount = 0D;//�ͻ��ڶ쳧���ѵ��ܶ�
    private Double amount = 0D;//�ͻ��������ѽ��
    private CalPrice calPrice = new Orgnic();//ÿ���ͻ�����һ������۸�Ĳ��ԣ���ʼ������ͨ���㣬��ԭ��

    //�ͻ�����Ƥ�����ͻ����������ܶ�
    public void buy(Double amount) {
        this.amount = amount;
        totalAmount += amount;
        /* �仯�㣬���ǽ����Ե��ƶ�ת�Ƹ��˲��Թ��������ⲿ�����η����ȥ */
        calPrice = CalPriceFactory.getInstance().createCalPrice(this);
    }

    //����ͻ�����Ҫ����Ǯ
    public Double calLastAmount() {
        return calPrice.calPrice(amount);
    }

    public Double getTotalAmount() {
        return totalAmount;
    }
}
package com.behavioral.visitor.bill_example.data;

import com.behavioral.visitor.bill_example.Visitor;

public class OutcomeBill implements Bill {
    private double amount;
    private String item;

    public OutcomeBill(String item, double amount) {
        this.item = item;
        this.amount = amount;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.viewOutcomeBill(this);
    }

    public double getAmount() {
        return amount;
    }

    public String getItem() {
        return item;
    }
}

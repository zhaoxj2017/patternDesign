package com.behavioral.visitor.bill_example.data;

import com.behavioral.visitor.bill_example.Visitor;

public class IncomeBill implements Bill {
    private double amount;
    private String item;

    public IncomeBill(String item, double amount) {
        this.item = item;
        this.amount = amount;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.viewIncomeBill(this);
    }

    public double getAmount() {
        return amount;
    }

    public String getItem() {
        return item;
    }
}

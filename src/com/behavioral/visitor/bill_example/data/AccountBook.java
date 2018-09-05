package com.behavioral.visitor.bill_example.data;

import com.behavioral.visitor.bill_example.Visitor;

import java.util.ArrayList;
import java.util.List;

public class AccountBook {
    private List<Bill> billList = new ArrayList<>();

    public void addTransaction(Bill bill) {
        billList.add(bill);
    }

    public void show(Visitor visitor) {
        for (Bill bill: billList) {
            bill.accept(visitor);
        }
    }
}

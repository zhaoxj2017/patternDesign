package com.behavioral.visitor.bill_example;

import com.behavioral.visitor.bill_example.data.IncomeBill;
import com.behavioral.visitor.bill_example.data.OutcomeBill;

public class Boss implements Visitor {
    private double totalIncome;
    private double totalOutcome;

    @Override
    public void viewIncomeBill(IncomeBill incomeBill) {
        totalIncome += incomeBill.getAmount();
    }

    @Override
    public void viewOutcomeBill(OutcomeBill outcomeBill) {
        totalOutcome += outcomeBill.getAmount();
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public double getTotalOutcome() {
        return totalOutcome;
    }
}

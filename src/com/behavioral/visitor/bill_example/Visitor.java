package com.behavioral.visitor.bill_example;

import com.behavioral.visitor.bill_example.data.IncomeBill;
import com.behavioral.visitor.bill_example.data.OutcomeBill;

public interface Visitor {
    void viewIncomeBill(IncomeBill incomeBill);
    void viewOutcomeBill(OutcomeBill outcomeBill);
}

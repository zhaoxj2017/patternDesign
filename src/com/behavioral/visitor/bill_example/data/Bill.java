package com.behavioral.visitor.bill_example.data;

import com.behavioral.visitor.bill_example.Visitor;

public interface Bill {
    void accept(Visitor visitor);
}

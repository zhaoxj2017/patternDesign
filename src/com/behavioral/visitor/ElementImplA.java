package com.behavioral.visitor;

public class ElementImplA implements Element {
    private String str = "123";

    @Override
    public void accept(Visitor visitor) {
        visitor.VisitElementA(this);
    }

    public String operateA() {
        return str;
    }
}

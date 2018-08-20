package com.behavioral.visitor;

public class ElementImplB implements Element{
    private String str = "123";
    @Override
    public void accept(Visitor visitor) {
        visitor.VisitElementB(this);
    }

    public String operateB() {
        return str;
    }
}

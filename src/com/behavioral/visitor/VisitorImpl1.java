package com.behavioral.visitor;

public class VisitorImpl1 implements Visitor {
    @Override
    public void VisitElementA(ElementImplA elementA) {
        System.out.println(elementA.operateA());
    }

    @Override
    public void VisitElementB(ElementImplB elementB) {
        System.out.println(elementB.operateB());
    }
}

package com.behavioral.visitor;

public class Client {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.attach(new ElementImplA());
        os.attach(new ElementImplB());

        Visitor visitor = new VisitorImpl1();
        os.accept(visitor);
    }
}

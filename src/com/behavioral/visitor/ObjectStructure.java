package com.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    private List<Element> elements = new ArrayList<Element>();

    void attach(Element element) {
        elements.add(element);
    }

    void detach(Element element) {
        elements.remove(element);
    }

    void accept(Visitor visitor) {
        for (Element element: elements) {
            element.accept(visitor);
        }
    }
}

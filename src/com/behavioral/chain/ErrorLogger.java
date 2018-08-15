package com.behavioral.chain;

public class ErrorLogger extends AbstractLogger {

    ErrorLogger (int level) {
        this.level = level;
    }
    @Override
    void write(String message) {
        System.out.println("print Error : " + message);
    }
}

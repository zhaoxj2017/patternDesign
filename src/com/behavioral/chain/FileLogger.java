package com.behavioral.chain;

public class FileLogger extends AbstractLogger {

    FileLogger (int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("print in file : " + message);
    }
}

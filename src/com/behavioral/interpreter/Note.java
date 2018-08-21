package com.behavioral.interpreter;

public class Note extends Expression {
    @Override
    public void execute(String key, double value) {
        String note;
        switch (key) {
            case "C" : note = "Do"; break;
            case "D" : note = "Re"; break;
            case "E" : note = "Mi"; break;
            case "F" : note = "Fa"; break;
            case "G" : note = "So"; break;
            case "A" : note = "La"; break;
            case "B" : note = "Ti"; break;
            default: note = "";
        }
        System.out.println(" " + note + " " + value);
    }
}

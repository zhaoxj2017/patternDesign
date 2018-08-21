package com.behavioral.interpreter;

public abstract class Expression {
    public void interpreter(PlayContext context) {
        if (context.getText().length() == 0) {
            return;
        }
        String playKey = context.getText().substring(0, 1);
        context.setText(context.getText().substring(2));
        int index = context.getText().indexOf(" ");
        Double playValue = Double.parseDouble(context.getText().substring(0, index));
        context.setText(context.getText().substring(index + 1));

        execute(playKey, playValue);
    }

    public abstract void execute(String key, double value);
}

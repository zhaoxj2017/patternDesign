package com.behavioral.state;

public class ErrorState implements State {
    public String toString() {
        return "Error state";
    }

    @Override
    public void doAction(Context context) {
        if (context.getCommand().equalsIgnoreCase("Error")) {
            System.out.println("Encounter error, request failed");
        } else {
            // 到下一个状态 运行状态
            context.setState(new RunningState());
            context.request();
        }
    }
}

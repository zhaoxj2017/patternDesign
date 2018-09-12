package com.behavioral.state;

public class ErrorState implements State {
    @Override
    public String toString() {
        return "Error state";
    }

    @Override
    public void doAction(Context context) {
        if ("Error".equalsIgnoreCase(context.getCommand())) {
            System.out.println("Encounter error, request failed");
        } else {
            // 到下一个状态 运行状态
            context.setState(new RunningState());
            context.request();
        }
    }
}

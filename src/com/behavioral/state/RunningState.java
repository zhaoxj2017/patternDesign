package com.behavioral.state;

public class RunningState implements State {

    @Override
    public String toString() {
        return "Start state";
    }

    @Override
    public void doAction(Context context) {
        if ("running".equalsIgnoreCase(context.getCommand())) {
            System.out.println("Request successfully");
        } else {
            // 到下一个状态
            // State 的子类，一定都要过到一个状态，而却每个状态都应该出现.
            context.setState(new StopState());
            context.request();
        }
    }
}

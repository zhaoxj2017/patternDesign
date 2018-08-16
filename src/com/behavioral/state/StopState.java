package com.behavioral.state;

public class StopState implements State {

    public String toString() {
        return "Stop state";
    }

    @Override
    public void doAction(Context context) {
        if (context.getCommand().equalsIgnoreCase("stop")) {
            System.out.println("Program stop, request reject");
        } else {
            context.setState(new ErrorState());
            context.request();
        }
    }
}

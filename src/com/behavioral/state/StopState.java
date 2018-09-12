package com.behavioral.state;

/**
 * @author 赵兴君_F
 */
public class StopState implements State {

    @Override
    public String toString() {
        return "Stop state";
    }

    @Override
    public void doAction(Context context) {
        String command = "stop";
        if (context.getCommand().equalsIgnoreCase(command)) {
            System.out.println("Program stop, request reject");
        } else {
            context.setState(new ErrorState());
            context.request();
        }
    }
}

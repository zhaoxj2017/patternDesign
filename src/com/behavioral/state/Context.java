package com.behavioral.state;

public class Context {
    private State state;
    private String command; // 改变内在状态的指令

    public Context (State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

    public void request() {
        state.doAction(this);
    }
}

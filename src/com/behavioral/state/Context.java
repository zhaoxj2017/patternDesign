package com.behavioral.state;

class Context {
    private State state;
    private String command; // 改变内在状态的指令

    Context(State state) {
        this.state = state;
    }

    void setState(State state) {
        this.state = state;
    }

    State getState() {
        return state;
    }

    void setCommand(String command) {
        this.command = command;
    }

    String getCommand() {
        return command;
    }

    void request() {
        state.doAction(this);
    }
}

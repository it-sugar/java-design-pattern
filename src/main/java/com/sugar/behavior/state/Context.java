package com.sugar.behavior.state;

/**
 * @author gshi
 * 功能描述 上下文
 */
public class Context {

    private State state;

    public Context() {
        this.state = new ReadyState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void handle() {
        this.state.handle(this);
    }
}

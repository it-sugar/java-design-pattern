package com.sugar.behavior.state;

/**
 * @author gshi
 * 功能描述 已经准备好
 */
public class ReadyState implements State {

    @Override
    public void handle(Context context) {
        System.out.println("已经准备好了");
        context.setState(new RunningState());
    }

}

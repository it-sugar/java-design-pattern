package com.sugar.behavior.state;

/**
 * @author gshi
 * 功能描述 正在运行状态
 */
public class RunningState implements State {

    @Override
    public void handle(Context context) {
        System.out.println("正在运行了");
        context.setState(new StopState());
    }

}

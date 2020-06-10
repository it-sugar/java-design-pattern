package com.sugar.behavior.state;

/**
 * @author gshi
 * 功能描述 结束运行状态
 */
public class StopState implements State {
    @Override
    public void handle(Context context) {
        System.out.println("已经结束运行了");
        context.setState(new ReadyState());
    }
}

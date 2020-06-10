package com.sugar.behavior.state;

/**
 * @author gshi
 * 功能描述 状态接口
 */
public interface State {

    /**
     * 处理
     *
     * @param context 上下文对象
     */
    void handle(Context context);

}

package com.github.tongjisserollman.iceamusementpark.state;

/**
 * @author aodethri
 *
 * 旋转茶杯对象
 */
public class Teacup {

    /**
     * 旋转茶杯的状态
     */
    private State state;

    public Teacup(){
        state = null;
    }

    /**
     * 设置旋转茶杯的状态
     * @param state 目标状态
     */
    public void setState(State state){
        this.state = state;
    }

    /**
     * 获取旋转茶杯的状态
     * @return 目前状态
     */
    public State getState(){
        return state;
    }
}

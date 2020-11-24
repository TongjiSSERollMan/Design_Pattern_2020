package com.github.tongjisserollman.iceamusementpark.builder;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author rand1925
 *
 * 小杯柠檬冰沙
 *
 */
public class SmallLemonSmoothieBuilder extends SmoothieBuilder {

    /**
     * 设置冰沙的水果为柠檬
     */
    @Override
    public void setFruit() {
        this.fruit = "柠檬";
        CallStackLogger.log(
                new CallStackLogInfo(
                        "SmallLemonSmoothieBuilder",
                        "setFruit",
                        String.valueOf(System.identityHashCode(this)),
                        "设置冰沙的水果为柠檬"
                )
        );
    }

    /**
     * 设置冰沙的重量为15g
     */
    @Override
    public void setWeight() {
        this.weight = 15;
        CallStackLogger.log(
                new CallStackLogInfo(
                        "SmallLemonSmoothieBuilder",
                        "setWeight",
                        String.valueOf(System.identityHashCode(this)),
                        "设置冰沙的重量为15g"
                )
        );
    }
}

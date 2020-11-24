package com.github.tongjisserollman.iceamusementpark.builder;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author rand1925
 *
 * 小杯柠檬冰沙
 *
 */
public class BigAppleSmoothieBuilder extends SmoothieBuilder {

    /**
     * 设置冰沙的水果为苹果
     */
    @Override
    public void setFruit() {
        CallStackLogger.log(
            new CallStackLogInfo(
                        "BigAppleSmoothieBuilder",
                        "setFruit",
                        String.valueOf(System.identityHashCode(this)),
                        "设置冰沙的水果为苹果"
                )
        );
        this.fruit = "苹果";
    }

    /**
     * 设置冰沙的重量为45g
     */
    @Override
    public void setWeight() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "BigAppleSmoothieBuilder",
                        "setWright",
                        String.valueOf(System.identityHashCode(this)),
                        "设置冰沙的重量为45g"
                )
        );
        this.weight = 45;
    }
}

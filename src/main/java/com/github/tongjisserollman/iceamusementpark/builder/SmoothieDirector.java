package com.github.tongjisserollman.iceamusementpark.builder;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author rand1925
 *
 * 指导冰沙制作的类
 *
 */
public class SmoothieDirector {
    private SmoothieBuilder smoothieBuilder;
    /**
     * 设置特定建造者
     *
     * @param smoothieBuilder 特定建造者
     */
    public void setSmoothieBuilder(SmoothieBuilder smoothieBuilder) {
       this.smoothieBuilder = smoothieBuilder;
        CallStackLogger.log(
                new CallStackLogInfo(
                        "SmoothieDirector",
                        "SmoothieDirector",
                        String.valueOf(System.identityHashCode(this)),
                        "设置特定建造者"
                )
        );
    }

    /**
     * 指导冰沙的制作
     */
    public void construct() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "SmoothieDirector",
                        "construct",
                        String.valueOf(System.identityHashCode(this)),
                        "指导冰沙的制作"
                )
        );
        smoothieBuilder.setFruit();
        smoothieBuilder.setWeight();
    }
}
package com.github.tongjisserollman.iceamusementpark.commodities.smoothie.builder;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author rand1925
 *
 * 冰沙的 Product 类
 *
 */
public class Smoothie {
    private final int weight;
    private final String fruit;

    /**
     *
     * @param weight 冰沙的重量
     * @param fruit 冰沙附加的水果
     */
    public Smoothie(int weight, String fruit) {
        this.fruit = fruit;
        this.weight = weight;
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Smoothie",
                        "Smoothie",
                        String.valueOf(System.identityHashCode(this)),
                        String.format("制作成%dg的%s冰沙",this.weight, this.fruit)
                )
        );
    }

    /**
     * 展示产品
     */
    public void eat() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Smoothie",
                        "eat",
                        String.valueOf(System.identityHashCode(this)),
                        String.format("吃掉了%dg的%s冰沙",this.weight, this.fruit)
                )
        );
    }

}

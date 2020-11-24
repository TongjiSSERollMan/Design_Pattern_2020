package com.github.tongjisserollman.iceamusementpark.builder;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author rand1925
 *
 * 抽象冰沙建造器类
 *
 */
public abstract class SmoothieBuilder {
    protected int weight;
    protected String fruit;

    /**
     * 设置冰沙重量
     */
    public abstract void setWeight();

    /**
     * 设置冰沙的水果
     */
    public abstract void setFruit();

    /**
     * 生成冰沙
     *
     * @return 生成的冰沙
     */
    public Smoothie build() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "AbstractSmoothieBuilder",
                        "build",
                        String.valueOf(System.identityHashCode(this)),
                        String.format("以重量为%dg，水果为%s，制作冰沙",this.weight, this.fruit)
                )
        );
        return new Smoothie(weight, fruit);
    }

}

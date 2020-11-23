package com.github.tongjisserollman.iceamusementpark.strategy;

/**
 * @author HR8398Cephei
 *
 * 滑雪的人
 */
public class Skier {

    /**
     * 滑雪方式
     */
    private SkiStrategy skiStrategy;

    /**
     * 滑雪人名字
     */
    private String skierName;

    public Skier(SkiStrategy skiStrategy, String skierName) {
        this.skierName = skierName;
        this.skiStrategy = skiStrategy;
    }

    public void ski() {
        skiStrategy.ski(skierName);
    }

    public void setSkiStrategy(SkiStrategy skiStrategy) {
        this.skiStrategy = skiStrategy;
    }

    public void setSkierName(String skierName) {
        this.skierName = skierName;
    }

    public String getSkierName() {
        return skierName;
    }
}

package com.github.tongjisserollman.iceamusementpark.builder;
/**
 * @author rand1925
 *
 *
 * 冰沙的 Product 类
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
    }

    /**
     * 展示产品
     */
    public void show() {
        System.out.printf("%d 克的 %s 冰沙\n", this.weight, this.fruit);
    }

}

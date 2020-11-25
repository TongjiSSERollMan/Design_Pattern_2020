package com.github.tongjisserollman.iceamusementpark.abstractfactory;
/**
 * @author Moreonenight
 *
 * 物品状雪雕
 */
public abstract class CarvedThings extends SnowCarving {
    public CarvedThings(String carvedName) {
        super(carvedName);
    }
    public abstract void run();
}

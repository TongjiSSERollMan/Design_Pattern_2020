package com.github.tongjisserollman.iceamusementpark.abstractfactory;
/**
 * @author Moreonenight
 *
 * 人形雪雕
 */
public abstract class CarvedPeople extends SnowCarving {
    public CarvedPeople(String carvedName) {
        super(carvedName);
    }
    public abstract void run();
}

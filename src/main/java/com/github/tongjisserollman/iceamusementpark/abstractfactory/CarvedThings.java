package com.github.tongjisserollman.iceamusementpark.abstractfactory;
/**
 * @author Moreonenight
 *
 * 物品状冰雕
 */
public abstract class CarvedThings extends IceCarving {
    public CarvedThings(String carvedName) {
        super(carvedName);
    }
    public abstract void run();
}

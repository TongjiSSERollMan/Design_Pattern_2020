package com.github.tongjisserollman.iceamusementpark.abstractfactory;
/**
 * @author Moreonenight
 *
 * 人形冰雕
 */
public abstract class CarvedPeople extends IceCarving{
    public CarvedPeople(String carvedName) {
        super(carvedName);
    }
    public abstract void run();
}

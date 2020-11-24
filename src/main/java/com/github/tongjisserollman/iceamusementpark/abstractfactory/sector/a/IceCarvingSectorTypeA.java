package com.github.tongjisserollman.iceamusementpark.abstractfactory.sector.a;

import com.github.tongjisserollman.iceamusementpark.abstractfactory.IceCarvingFactory;
/**
 * @author Moreonenight
 *
 * 浮雕类型的冰雕园地
 */
public class IceCarvingSectorTypeA extends IceCarvingFactory {
    @Override
    public CarvedPeopleA createCarvedPeople(String carvedName) {
        return new CarvedPeopleA(carvedName);
    }
    @Override
    public CarvedThingsA createCarvedThings(String carvedName) {
        return new CarvedThingsA(carvedName);
    }
}

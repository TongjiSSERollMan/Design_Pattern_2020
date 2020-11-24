package com.github.tongjisserollman.iceamusementpark.abstractfactory.sector.b;

import com.github.tongjisserollman.iceamusementpark.abstractfactory.IceCarvingFactory;
/**
 * @author Moreonenight
 *
 * 圆雕类型的冰雕园地
 */
public class IceCarvingSectorTypeB extends IceCarvingFactory {
    @Override
    public CarvedPeopleB createCarvedPeople(String carvedName) {
        return new CarvedPeopleB(carvedName);
    }
    @Override
    public CarvedThingsB createCarvedThings(String carvedName) {
        return new CarvedThingsB(carvedName);
    }
}

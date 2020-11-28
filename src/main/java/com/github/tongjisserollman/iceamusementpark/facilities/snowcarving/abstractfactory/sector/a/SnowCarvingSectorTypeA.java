package com.github.tongjisserollman.iceamusementpark.facilities.snowcarving.abstractfactory.sector.a;

import com.github.tongjisserollman.iceamusementpark.facilities.snowcarving.abstractfactory.SnowCarvingFactory;

/**
 * @author Moreonenight
 *
 * 浮雕类型的雪雕园地
 */
public class SnowCarvingSectorTypeA extends SnowCarvingFactory {
    @Override
    public CarvedPeopleA createCarvedPeople(String carvedName) {
        return new CarvedPeopleA(carvedName);
    }
    @Override
    public CarvedThingsA createCarvedThings(String carvedName) {
        return new CarvedThingsA(carvedName);
    }
}

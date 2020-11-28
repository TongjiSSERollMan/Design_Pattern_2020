package com.github.tongjisserollman.iceamusementpark.entertainment.snowcarving.abstractfactory.sector.b;

import com.github.tongjisserollman.iceamusementpark.entertainment.snowcarving.abstractfactory.SnowCarvingFactory;
/**
 * @author Moreonenight
 *
 * 圆雕类型的雪雕园地
 */
public class SnowCarvingSectorTypeB extends SnowCarvingFactory {
    @Override
    public CarvedPeopleB createCarvedPeople(String carvedName) {
        return new CarvedPeopleB(carvedName);
    }
    @Override
    public CarvedThingsB createCarvedThings(String carvedName) {
        return new CarvedThingsB(carvedName);
    }
}

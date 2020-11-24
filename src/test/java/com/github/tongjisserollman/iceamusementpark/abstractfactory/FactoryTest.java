package com.github.tongjisserollman.iceamusementpark.abstractfactory;

import com.github.tongjisserollman.iceamusementpark.abstractfactory.sector.a.CarvedPeopleA;
import com.github.tongjisserollman.iceamusementpark.abstractfactory.sector.a.CarvedThingsA;
import com.github.tongjisserollman.iceamusementpark.abstractfactory.sector.a.IceCarvingSectorTypeA;
import com.github.tongjisserollman.iceamusementpark.abstractfactory.sector.b.CarvedPeopleB;
import com.github.tongjisserollman.iceamusementpark.abstractfactory.sector.b.CarvedThingsB;
import com.github.tongjisserollman.iceamusementpark.abstractfactory.sector.b.IceCarvingSectorTypeB;
import org.junit.jupiter.api.Test;

public class FactoryTest {
    @Test
    void MyFactoryTest() {
        IceCarvingSectorTypeA sector1 = new IceCarvingSectorTypeA();
        IceCarvingSectorTypeB sector2 = new IceCarvingSectorTypeB();
        CarvedPeopleA carved1 = sector1.createCarvedPeople("小明");
        CarvedThingsA carved2 = sector1.createCarvedThings("大象");
        CarvedPeopleB carved3 = sector2.createCarvedPeople("小红");
        CarvedThingsB carved4 = sector2.createCarvedThings("橡皮");
        carved1.run();
        carved2.run();
        carved3.run();
        carved4.run();
    }
}


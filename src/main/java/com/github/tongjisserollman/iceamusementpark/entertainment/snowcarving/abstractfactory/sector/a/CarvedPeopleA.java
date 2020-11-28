package com.github.tongjisserollman.iceamusementpark.entertainment.snowcarving.abstractfactory.sector.a;

import com.github.tongjisserollman.iceamusementpark.entertainment.snowcarving.abstractfactory.CarvedPeople;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;
/**
 * @author Moreonenight
 *
 * 浮雕类型的人形雪雕
 */
public class CarvedPeopleA extends CarvedPeople {
    public CarvedPeopleA(String carvedName) {
        super(carvedName);
    }
    @Override
    public void run() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "CarvedPeopleInA",
                        "run",
                        String.valueOf(System.identityHashCode(this)),
                        "浮雕园区的人形雪雕上亮起了彩灯"
                )
        );
    }
}

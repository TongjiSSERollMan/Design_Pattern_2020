package com.github.tongjisserollman.iceamusementpark.abstractfactory.sector.b;

import com.github.tongjisserollman.iceamusementpark.abstractfactory.CarvedPeople;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;
/**
 * @author Moreonenight
 *
 * 圆雕类型的人形雪雕
 */
public class CarvedPeopleB extends CarvedPeople {
    public CarvedPeopleB(String carvedName) {
        super(carvedName);
    }
    @Override
    public void run() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "CarvedThingsInB",
                        "run",
                        String.valueOf(System.identityHashCode(this)),
                        "圆雕园区的人形雪雕上亮起了彩灯"
                )
        );
    }
}

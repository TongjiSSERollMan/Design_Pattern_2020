package com.github.tongjisserollman.iceamusementpark.abstractfactory.sector.a;

import com.github.tongjisserollman.iceamusementpark.abstractfactory.CarvedThings;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;
/**
 * @author Moreonenight
 *
 * 浮雕类型的物品状雪雕
 */
public class CarvedThingsA extends CarvedThings {
    public CarvedThingsA(String carvedName) {
        super(carvedName);
    }
    @Override
    public void run() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "CarvedThingsInA",
                        "run",
                        String.valueOf(System.identityHashCode(this)),
                        "浮雕园区的物品状雪雕上亮起了彩灯"
                )
        );
    }
}

package com.github.tongjisserollman.iceamusementpark.abstractfactory.sector.b;

import com.github.tongjisserollman.iceamusementpark.abstractfactory.CarvedThings;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;
/**
 * @author Moreonenight
 *
 * 圆雕类型的物品状冰雕
 */
public class CarvedThingsB extends CarvedThings {
    public CarvedThingsB(String carvedName) {
        super(carvedName);
    }
    @Override
    public void run() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "CarvedThingsInB",
                        "run",
                        String.valueOf(System.identityHashCode(this)),
                        "圆雕园区的物品状冰雕上亮起了彩灯"
                )
        );
    }
}

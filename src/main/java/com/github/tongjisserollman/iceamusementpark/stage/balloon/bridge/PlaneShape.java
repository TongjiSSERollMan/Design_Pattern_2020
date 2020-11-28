package com.github.tongjisserollman.iceamusementpark.stage.balloon.bridge;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Mrcopytuo
 *
 * 飞机形状类
 */

public class PlaneShape extends Shape {
    private String str = "飞机";
    public PlaneShape(MakeAPI makeAPI){
        super(makeAPI);
        CallStackLogger.log(
                new CallStackLogInfo(
                        "PlaneShape",
                        "PlaneShape",
                        String.valueOf(System.identityHashCode(this)),
                        "PlaneShape构造器"
                )
        );
    }
    @Override
    public void make() {
        makeAPI.makeBalloon(str);
        CallStackLogger.log(
                new CallStackLogInfo(
                        "PlaneShape",
                        "make",
                        String.valueOf(System.identityHashCode(this)),
                        "做一个飞机形状的气球"
                )
        );
    }
}

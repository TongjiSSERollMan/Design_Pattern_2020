package com.github.tongjisserollman.iceamusementpark.shows.balloon.bridge;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Mrcopytuo
 *
 * 红色气球类
 */

public class RedBalloon implements MakeAPI{
    @Override
    public void makeBalloon(String shape) {
        System.out.println("小丑做了一个红色的"+shape+"形状的的气球");
        CallStackLogger.log(
                new CallStackLogInfo(
                        "RedBalloon",
                        "makeBalloon",
                        String.valueOf(System.identityHashCode(this)),
                        String.format("做一个红色的%s形状的气球", shape)
                )
        );
    }

}
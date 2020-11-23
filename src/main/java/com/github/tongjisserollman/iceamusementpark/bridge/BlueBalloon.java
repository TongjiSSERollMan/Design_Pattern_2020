package com.github.tongjisserollman.iceamusementpark.bridge;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Mrcopytuo
 *
 * 蓝色气球类
 */

public class BlueBalloon implements MakeAPI{
    @Override
    public void makeBalloon(String shape) {
        System.out.println("小丑做了一个蓝色的"+shape+"形状的气球");
        CallStackLogger.log(
                new CallStackLogInfo(
                        "BlueBalloon",
                        "makeBalloon",
                        String.valueOf(System.identityHashCode(this)),
                        "做一个蓝色的气球"
                )
        );
    }

}
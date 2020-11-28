package com.github.tongjisserollman.iceamusementpark.entertainment.skiing.strategy;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author HR8398Cephei
 *
 * 单板滑雪
 */
public class SinglePlateSki implements SkiStrategy {
    @Override
    public void ski(String skierName) {
        String msg = skierName + "单板滑雪。。。。";

        CallStackLogger.log(
                new CallStackLogInfo(
                        "SinglePlateSki",
                        "ski",
                        String.valueOf(System.identityHashCode(this)),
                        msg
                )
        );
    }
}

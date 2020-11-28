package com.github.tongjisserollman.iceamusementpark.entertainment.skiing.strategy;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author HR8398Cephei
 *
 * 双板滑雪
 */
public class DoublePlateSki implements SkiStrategy {
    @Override
    public void ski(String skierName) {
        String msg = skierName + "双板滑雪。。。";

        CallStackLogger.log(
                new CallStackLogInfo(
                        "DoublePlateSki",
                        "ski",
                        String.valueOf(System.identityHashCode(this)),
                        msg
                )
        );
    }
}

package com.github.tongjisserollman.iceamusementpark.facilities.skating.adapter;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author HR8398Cephei
 *
 * 企鹅
 */
public class Penguin implements Skatable {
    /**
     * 企鹅溜冰
     */
    @Override
    public void skate() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Penguin",
                        "skate",
                        String.valueOf(System.identityHashCode(this)),
                        "企鹅溜冰"
                )
        );
    }
}

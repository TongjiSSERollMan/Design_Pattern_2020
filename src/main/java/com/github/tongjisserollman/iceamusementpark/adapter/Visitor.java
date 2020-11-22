package com.github.tongjisserollman.iceamusementpark.adapter;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author HR8398Cephei
 * 游乐园游客
 */

public class Visitor implements Walkable {
    /**
     * 游客行走
     */
    @Override
    public void walk() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Visitor",
                        "walk",
                        String.valueOf(System.identityHashCode(this)),
                        "游客行走"
                )
        );
    }
}

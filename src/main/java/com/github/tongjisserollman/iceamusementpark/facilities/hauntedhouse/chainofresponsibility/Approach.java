package com.github.tongjisserollman.iceamusementpark.facilities.hauntedhouse.chainofresponsibility;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author hq
 */
public class Approach extends PlayStep{
    /**
     * 买票-进场-游览-出场
     * 进场为第2步
     */
    public Approach() {
        super(2);
    }

    @Override
    protected void go() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Approach",
                        "go",
                        String.valueOf(System.identityHashCode(this)),
                        "鬼屋进场"
                )
        );
    }
}

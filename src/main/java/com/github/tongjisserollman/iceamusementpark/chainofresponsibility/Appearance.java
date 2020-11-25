package com.github.tongjisserollman.iceamusementpark.chainofresponsibility;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author hq
 */
public class Appearance extends PlayStep{
    /**
     * 买票-进场-游览-出场
     * 出场为第4步
     */
    public Appearance(){
        super(4);
    }

    @Override
    protected void go() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Appearance",
                        "go",
                        String.valueOf(System.identityHashCode(this)),
                        "鬼屋出场"
                )
        );
    }
}

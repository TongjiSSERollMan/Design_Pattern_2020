package com.github.tongjisserollman.iceamusementpark.chainofresponsibility;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author hq
 */
public class GoVisit extends PlayStep{
    /**
     * 买票-进场-游览-出场
     * 游览为第3步
     */
    public GoVisit(){
        super(3);
    }

    @Override
    protected void go() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "GoVisit",
                        "go",
                        String.valueOf(System.identityHashCode(this)),
                        "鬼屋游览"
                )
        );
    }
}

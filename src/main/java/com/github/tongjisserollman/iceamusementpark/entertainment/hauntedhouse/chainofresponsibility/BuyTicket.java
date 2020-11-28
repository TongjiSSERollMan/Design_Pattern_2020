package com.github.tongjisserollman.iceamusementpark.entertainment.hauntedhouse.chainofresponsibility;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author hq
 */
public class BuyTicket extends PlayStep {
    /**
     * 买票-进场-游览-出场
     * 买票为第1步
     */
    public BuyTicket(){
        super(1);
    }

    @Override
    protected void go() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "BuyTicket",
                        "go",
                        String.valueOf(System.identityHashCode(this)),
                        "鬼屋买票"
                )
        );
    }
}

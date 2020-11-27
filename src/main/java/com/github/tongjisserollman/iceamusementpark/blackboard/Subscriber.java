package com.github.tongjisserollman.iceamusementpark.blackboard;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author hq
 */
public class Subscriber {
    private String name;

    public Subscriber(String name){
        this.name = name;
    }

    /**
     * @description: 订阅者接收消息
     */
    public void receiveInfo(String info) {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "FacilityWall",
                        "display",
                        String.valueOf(System.identityHashCode(this)),
                        this.name + "收到信息: " + info
                )
        );
    }
}

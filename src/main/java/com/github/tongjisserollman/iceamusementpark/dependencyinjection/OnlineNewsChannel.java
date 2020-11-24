package com.github.tongjisserollman.iceamusementpark.dependencyinjection;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

public class OnlineNewsChannel implements NewsChannel {
    @Override
    public void publish(News news) {
        CallStackLogger.log(new CallStackLogInfo(
                "OnlineNewsChannel",
                "publish", String.valueOf(System.identityHashCode(this)),
                "在网络上发布消息"
        ));
        System.out.println("Publish Online: " + news.message);
    }
}

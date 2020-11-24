package com.github.tongjisserollman.iceamusementpark.dependencyinjection;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

public class NewsPublisher {
    public void publish(News news, NewsChannel channel){
        CallStackLogger.log(new CallStackLogInfo(
                "NewsPublisher",
                "publish", String.valueOf(System.identityHashCode(this)),
                "在渠道上发布消息"
        ));
        channel.publish(news);
    }
}

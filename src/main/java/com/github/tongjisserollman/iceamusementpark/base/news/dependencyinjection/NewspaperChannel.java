package com.github.tongjisserollman.iceamusementpark.base.news.dependencyinjection;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

public class NewspaperChannel implements NewsChannel {
    @Override
    public void publish(News news) {
        CallStackLogger.log(new CallStackLogInfo(
                "NewspaperChannel",
                "publish", String.valueOf(System.identityHashCode(this)),
                "在报纸上发布消息"
        ));
        System.out.println("Publish on Newspaper: " + news.message);
    }
}

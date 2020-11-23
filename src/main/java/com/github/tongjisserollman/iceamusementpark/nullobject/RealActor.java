package com.github.tongjisserollman.iceamusementpark.nullobject;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

public class RealActor extends AbstractActor {
    public RealActor(String name){
        this.name=name;
        CallStackLogger.log(
                new CallStackLogInfo(
                        "RealActor",
                        "RealActor",
                        String.valueOf(System.identityHashCode(this)),
                        "RealActor构造器"
                )
        );
    }
    @Override
    public boolean isNull() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "RealActor",
                        "isNull",
                        String.valueOf(System.identityHashCode(this)),
                        "判断是否为空对象"
                )
        );
        return false;
    }

    @Override
    public String getName() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "RealActor",
                        "getName",
                        String.valueOf(System.identityHashCode(this)),
                        "获取对象名"
                )
        );
        return name;
    }
}

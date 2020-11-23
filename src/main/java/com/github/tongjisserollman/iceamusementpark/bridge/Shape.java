package com.github.tongjisserollman.iceamusementpark.bridge;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

public abstract class Shape {
    protected MakeAPI makeAPI;
    protected Shape(MakeAPI makeAPI){
        this.makeAPI=makeAPI;
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Shape",
                        "Shape",
                        String.valueOf(System.identityHashCode(this)),
                        "Shape构造器"
                )
        );
    }
    public abstract void make();
}

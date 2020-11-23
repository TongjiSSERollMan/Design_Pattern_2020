package com.github.tongjisserollman.iceamusementpark.pipeline;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author xuedixuedi
 * <p>
 * 基础阀门
 */
public class BasicValve implements Valve {

    protected Valve next;

    @Override
    public Valve getNext() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "BasicValve",
                        "getNext",
                        String.valueOf(System.identityHashCode(this)),
                        "返回阀门的下一个阀门"
                )
        );
        return next;
    }

    @Override
    public void setNext(Valve v) {
        next = v;
    }

    @Override
    public void invoke(String s) {
        System.out.println("调用基础阀门");
    }
}

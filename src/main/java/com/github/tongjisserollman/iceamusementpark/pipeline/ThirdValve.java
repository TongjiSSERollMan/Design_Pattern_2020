package com.github.tongjisserollman.iceamusementpark.pipeline;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author xuedixuedi
 * <p>
 * 第三个阀门
 */
public class ThirdValve implements Valve {
    public Valve next;

    @Override
    public Valve getNext() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "ThirdValve",
                        "getNext",
                        String.valueOf(System.identityHashCode(this)),
                        "返回阀门的下一个阀门"
                )
        );
        return next;
    }

    @Override
    public void setNext(Valve v) {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "ThirdValve",
                        "setNext",
                        String.valueOf(System.identityHashCode(this)),
                        "返回阀门的下一个阀门"
                )
        );
        next = v;
    }

    @Override
    public void invoke(String s) {
        System.out.println("执行ThirdValve阀门，并掉调用下一个阀门");
        getNext().invoke(s);
    }
}

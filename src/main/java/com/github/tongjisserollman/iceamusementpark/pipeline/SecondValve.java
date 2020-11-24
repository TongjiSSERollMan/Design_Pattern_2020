package com.github.tongjisserollman.iceamusementpark.pipeline;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author xuedixuedi
 * <p>
 * 第二个普通阀门
 */
public class SecondValve implements Valve {

    public Valve next;

    @Override
    public Valve getNext() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "SecondValve",
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
                        "SecondValve",
                        "setNext",
                        String.valueOf(System.identityHashCode(this)),
                        "返回阀门的下一个阀门"
                )
        );
        next = v;
    }

    @Override
    public void invoke(String s) {
        System.out.println("执行SecondValve阀门，并掉调用下一个阀门");
        getNext().invoke(s);
    }
}

package com.github.tongjisserollman.iceamusementpark.office.principal.proxy;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

public class SecretaryPrincipal implements Principal {

    private RealPrincipal realPrincipal;
    private String task;

    /**
     * @param work 代理工作
     */
    public SecretaryPrincipal(String work) {
        this.task = work;
    }

    /**
     * 执行任务
     */
    @Override
    public void performTask() {
        if (realPrincipal == null) {
            realPrincipal = new RealPrincipal(task);
        }
        realPrincipal.performTask();

        CallStackLogger.log(
                new CallStackLogInfo(
                        "SecretaryPrincipal",
                        "performTask",
                        String.valueOf(System.identityHashCode(this)),
                        "执行任务"
                )
        );
    }
}

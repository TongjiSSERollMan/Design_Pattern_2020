package com.github.tongjisserollman.iceamusementpark.proxy;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author LXD
 * 真实园长
 */
public class RealPrincipal implements Principal {
    private String task;

    /**
     * @param work 工作内容
     */
    public RealPrincipal(String work) {
        this.task = work;
        giveTask(work);
        CallStackLogger.log(
                new CallStackLogInfo(
                        "RealPrincipal",
                        "RealPrincipal",
                        String.valueOf(System.identityHashCode(this)),
                        "接受work内容初始化园长的工作"
                )
        );
    }


    /**
     * 执行任务
     */
    @Override
    public void performTask() {
        System.out.println("执行任务：" + task);

        CallStackLogger.log(
                new CallStackLogInfo(
                        "RealPrincipal",
                        "performTask",
                        String.valueOf(System.identityHashCode(this)),
                        "执行某项任务"
                )
        );
    }

    /**
     * @param work 园长本人制定任务
     */
    private void giveTask(String work) {
        System.out.println("制定任务：" + work);

        CallStackLogger.log(
                new CallStackLogInfo(
                        "RealPrincipal",
                        "giveTask",
                        String.valueOf(System.identityHashCode(this)),
                        "园长本人制定任务"
                )
        );
    }
}

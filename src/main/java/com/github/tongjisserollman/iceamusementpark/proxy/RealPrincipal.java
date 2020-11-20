package com.github.tongjisserollman.iceamusementpark.proxy;

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
    }


    /**
     * 执行任务
     */
    @Override
    public void performTask() {
        System.out.println("执行任务：" + task);
    }

    /**
     * @param work 园长本人制定任务
     */
    private void giveTask(String work) {
        System.out.println("制定任务：" + work);
    }
}

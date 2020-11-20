package com.github.tongjisserollman.iceamusementpark.proxy;

public class SecretaryPrinciple implements Principal {

    private RealPrincipal realPrincipal;
    private String task;

    /**
     * @param work 代理工作
     */
    public SecretaryPrinciple(String work) {
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
    }
}

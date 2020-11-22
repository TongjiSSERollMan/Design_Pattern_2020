package com.github.tongjisserollman.iceamusementpark.chainofresponsibility;

/**
 * @author hq
 */
public class Request {
    private int step;
    /**
     * @description: 游客游览鬼屋步骤 数字化
     */
    public Request(int step) {
        this.step = step;
    }

    /**
     * 获取该步骤
     * @return 步骤的数字化表示
     */
    public int getStep() {
        return this.step;
    }
}

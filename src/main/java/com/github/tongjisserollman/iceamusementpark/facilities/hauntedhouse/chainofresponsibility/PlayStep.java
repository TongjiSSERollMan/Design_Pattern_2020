package com.github.tongjisserollman.iceamusementpark.facilities.hauntedhouse.chainofresponsibility;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author hq
 */
public abstract class PlayStep {
    private int step;
    private PlayStep next = null;

    public PlayStep(int step) {
        this.step = step;
    }

    /**
     * 获取该步骤
     * @return 步骤的数字化表示
     */
    public int getStep() {
        return step;
    }

    /**
     * 设置该步骤的下一步
     */
    public void setNext(PlayStep next){
        this.next = next;
    }

    public PlayStep getNext(){
        return next;
    }

    /**
     * 游玩鬼屋
     */
    protected abstract void go();

    /**
     * 处理游玩步骤的方法
     * 如果可以处理就处理，否则则向后传递
     */
    public final void playStepRequest(Request request) {

        if (this.step > request.getStep()) {
            this.go();
        } else {
            if (this.next != null) {
                this.next.playStepRequest(request);
            }
            else {
                CallStackLogger.log(
                        new CallStackLogInfo(
                                "PlayStep",
                                "playStepRequest",
                                String.valueOf(System.identityHashCode(this)),
                                "鬼屋游玩步骤错误"
                        )
                );
            }
        }
    }
}

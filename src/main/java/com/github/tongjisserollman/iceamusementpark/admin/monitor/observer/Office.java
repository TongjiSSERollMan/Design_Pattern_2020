package com.github.tongjisserollman.iceamusementpark.admin.monitor.observer;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author HR8398Cephei
 *
 * 园长办公室，可查看游乐园内人数
 */
public class Office implements VisitorObserver {

    /**
     * 当游乐园内人数改变时触发的更新函数
     */
    @Override
    public void update() {
        String msg = "(园长办公室) 游乐园当前人数" + VisitorsSystem.getInstance().getVisitorsCount();

        CallStackLogger.log(
                new CallStackLogInfo(
                        "Office",
                        "update",
                        String.valueOf(System.identityHashCode(this)),
                        msg
                )
        );
    }
}

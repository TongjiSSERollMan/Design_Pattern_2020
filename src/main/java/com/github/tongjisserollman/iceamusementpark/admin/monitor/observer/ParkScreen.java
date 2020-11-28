package com.github.tongjisserollman.iceamusementpark.admin.monitor.observer;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author HR8398Cephei
 *
 * 游乐园门口显示屏，可查看游乐园内人数
 */
public class ParkScreen implements VisitorObserver {
    /**
     * 当游乐园内人数改变时触发的更新函数
     */
    @Override
    public void update() {
        String msg = "(游乐园门口显示屏) 当前游乐园内人数：" + VisitorsSystem.getInstance().getVisitorsCount();

        CallStackLogger.log(
                new CallStackLogInfo(
                        "ParkScreen",
                        "update",
                        String.valueOf(System.identityHashCode(this)),
                        msg
                )
        );
    }
}

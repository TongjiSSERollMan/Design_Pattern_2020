package com.github.tongjisserollman.iceamusementpark.admin.monitor.observer;

/**
 * @author HR8398Cephei
 *
 * 游乐园门口闸机
 */
public class Turnstile {

    /**
     * 游客通过闸机进入游乐园
     */
    public void visitorEnter() {
        VisitorsSystem.getInstance().increaseVisitorsCount();
    }

    /**
     * 游客通过闸机离开游乐园
     */
    public void visitorLeave() {
        VisitorsSystem.getInstance().decreaseVisitorsCount();
    }
}

package com.github.tongjisserollman.iceamusementpark.observer;

import com.github.tongjisserollman.iceamusementpark.abstractfactory.Facility;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

import java.util.ArrayList;
import java.util.List;

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

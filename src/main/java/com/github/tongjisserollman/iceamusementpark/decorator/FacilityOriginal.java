package com.github.tongjisserollman.iceamusementpark.decorator;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author hq
 */
public class FacilityOriginal implements Facility {
    /**
     * 具体构件角色:初始游乐设施
     */
    @Override
    public void display() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "FacilityOriginal",
                        "display",
                        String.valueOf(System.identityHashCode(this)),
                        "游乐设施初始形态"
                )
        );
    }
}

package com.github.tongjisserollman.iceamusementpark.entertainment.wall.decorator;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author hq
 */
public class FacilityTiming extends FacilityDecorator{

    public FacilityTiming(Facility decoratedFacility) {
        super(decoratedFacility);
    }
    /**
     * 具体装饰角色:游乐设施计时
     */
    @Override
    public void display() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "FacilityTiming",
                        "display",
                        String.valueOf(System.identityHashCode(this)),
                        "给游乐设施增加计时功能"
                )
        );
        decoratedFacility.display();
        setFacilityTiming(decoratedFacility);
    }

    private void setFacilityTiming(Facility decoratedShape){
        System.out.println("The facility has a timer function");
    }
}


package com.github.tongjisserollman.iceamusementpark.facilities.wall.decorator;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author hq
 */
public class FacilityWall extends FacilityDecorator{

    public FacilityWall(Facility decoratedFacility) {
        super(decoratedFacility);
    }
    /**
     * 具体装饰角色:游乐设施围墙
     */
    @Override
    public void display() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "FacilityWall",
                        "display",
                        String.valueOf(System.identityHashCode(this)),
                        "给游乐设施增加围墙"
                )
        );
        decoratedFacility.display();
        setFacilityWall(decoratedFacility);
    }

    private void setFacilityWall(Facility decoratedShape){
        System.out.println("The facility has a wall");
    }
}
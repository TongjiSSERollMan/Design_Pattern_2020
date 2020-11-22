package com.github.tongjisserollman.iceamusementpark.abstractfactory;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Moreonenight
 *
 * 不同类型的游乐设施
 */
public abstract class Facility {
    private final int facilityId;
    private String facilityName;
    static private int myId = 0;
    public Facility(String facilityName) {
        this.facilityId = myId;
        myId++;
        this.facilityName = facilityName;
    }
    public Facility() {
        this.facilityId = myId;
        myId++;
        this.facilityName = "";
    }
    public int getFacilityId() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Facility",
                        "getFacilityId",
                        String.valueOf(System.identityHashCode(this)),
                        "获取游乐设施的编号"
                )
        );
        return facilityId;
    }
    public String getFacilityName() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Facility",
                        "getFacilityName",
                        String.valueOf(System.identityHashCode(this)),
                        "获取游乐设施的名称"
                )
        );
        return facilityName;
    }
    public void setFacilityName(String facilityName) {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Facility",
                        "setFacilityName",
                        String.valueOf(System.identityHashCode(this)),
                        "设置游乐设施的名称"
                )
        );
        this.facilityName = facilityName;
    }
    /**
     * 运行设施
     */
    public abstract void run();
}

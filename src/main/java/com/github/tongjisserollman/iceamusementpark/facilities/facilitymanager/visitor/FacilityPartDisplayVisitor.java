package com.github.tongjisserollman.iceamusementpark.facilities.facilitymanager.visitor;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

public class FacilityPartDisplayVisitor implements FacilityPartVisitor {

    @Override
    public void visit(Facility facility) {
        System.out.println("检查设备");
        CallStackLogger.log(
                new CallStackLogInfo(
                        "FacilityPartDisplayVisitor",
                        "visit",
                        String.valueOf(System.identityHashCode(this)),
                        "检查设备"
                )
        );
    }

    @Override
    public void visit(FacilityTemperature facilityTemperature) {
        System.out.println("检查设备温度");
        CallStackLogger.log(
                new CallStackLogInfo(
                        "FacilityPartDisplayVisitor",
                        "visit",
                        String.valueOf(System.identityHashCode(this)),
                        "检查设备温度"
                )
        );
    }

    @Override
    public void visit(FacilityPower facilityPower) {
        System.out.println("检查设备电量");
        CallStackLogger.log(
                new CallStackLogInfo(
                        "FacilityPartDisplayVisitor",
                        "visit",
                        String.valueOf(System.identityHashCode(this)),
                        "检查设备电量"
                )
        );
    }

    @Override
    public void visit(FacilityUsage facilityUsage) {
        System.out.println("检查设备使用情况");
        CallStackLogger.log(
                new CallStackLogInfo(
                        "FacilityPartDisplayVisitor",
                        "visit",
                        String.valueOf(System.identityHashCode(this)),
                        "检查设备使用情况"
                )
        );
    }

}

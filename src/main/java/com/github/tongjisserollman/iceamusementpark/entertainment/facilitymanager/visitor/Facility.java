package com.github.tongjisserollman.iceamusementpark.entertainment.facilitymanager.visitor;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author xuedixuedi
 */
public class Facility implements FacilityPart {

    FacilityPart[] parts;

    public Facility() {
        parts = new FacilityPart[]{new FacilityTemperature(), new FacilityPower(), new FacilityUsage()};
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Facility",
                        "Facility",
                        String.valueOf(System.identityHashCode(this)),
                        "初始化娱乐设施，包括内容：设施温度、电量、使用情况"
                )
        );
    }

    /**
     * @param facilityPartVisitor 访问工具
     */
    @Override
    public void accept(FacilityPartVisitor facilityPartVisitor) {
        for (int i = 0; i < parts.length; ++i) {
            parts[i].accept(facilityPartVisitor);
        }
        facilityPartVisitor.visit(this);
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Facility",
                        "accept",
                        String.valueOf(System.identityHashCode(this)),
                        "分别接受visitor（检查者）对温度、电量、使用情况以及设施的检查"
                )
        );
    }
}

package com.github.tongjisserollman.iceamusementpark.facilities.facilityfilter.filter;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

import java.util.ArrayList;
import java.util.List;
/**
 * @author hq
 */
public class CriteriaMild implements Criteria{
    /**
     * 获取程度温和的游乐设施
     * @return 目标游乐设施
     */
    @Override
    public List<Facility> meetCriteria(List<Facility> facilities) {
        List<Facility> targetFacilities = new ArrayList<Facility>();
        for (Facility facility : facilities) {
            if(facility.getType().equalsIgnoreCase("mild")){
                targetFacilities.add(facility);
            }
        }
        String msg = "";
        for (Facility facility : facilities){
            msg = msg + facility.getName() +
                    " 年龄限制:" + facility.getAgeLowerLimit() +
                    "类型:" + facility.getType() + "\n";
        }

        CallStackLogger.log(
                new CallStackLogInfo(
                        "CriteriaMild",
                        "meetCriteria",
                        String.valueOf(System.identityHashCode(this)),
                        "Mild:\n" + msg
                )
        );
        return targetFacilities;
    }
}
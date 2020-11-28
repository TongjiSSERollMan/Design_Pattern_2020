package com.github.tongjisserollman.iceamusementpark.facilities.facilityfilter.filter;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

import java.util.ArrayList;
import java.util.List;
/**
 * @author hq
 */
public class CriteriaMinor implements Criteria{
    /**
     * 获取未成年人可玩的游乐设施
     * @return 目标游乐设施
     */
    @Override
    public List<Facility> meetCriteria(List<Facility> facilities) {
        List<Facility> targetFacilities = new ArrayList<Facility>();
        for (Facility facility : facilities) {
            if(facility.getAgeLowerLimit() < 18){
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
                        "CriteriaMinor",
                        "meetCriteria",
                        String.valueOf(System.identityHashCode(this)),
                        "Minor:\n" + msg
                )
        );
        return targetFacilities;
    }
}

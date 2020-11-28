package com.github.tongjisserollman.iceamusementpark.entertainment.facilityfilter.filter;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

import java.util.ArrayList;
import java.util.List;
/**
 * @author hq
 */
public class CriteriaThrilling implements Criteria{
    /**
     * 获取惊险刺激类的游乐设施
     * @return 目标游乐设施
     */
    @Override
    public List<Facility> meetCriteria(List<Facility> facilities) {
        List<Facility> targetFacilities = new ArrayList<Facility>();
        for (Facility facility : facilities) {
            if(facility.getType().equalsIgnoreCase("thrilling")){
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
                        "CriteriaThrilling",
                        "meetCriteria",
                        String.valueOf(System.identityHashCode(this)),
                        "Thrilling:\n" + msg
                )
        );
        return targetFacilities;
    }
}
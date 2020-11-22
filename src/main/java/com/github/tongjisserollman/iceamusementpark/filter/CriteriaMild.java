package com.github.tongjisserollman.iceamusementpark.filter;

import java.util.ArrayList;
import java.util.List;
/**
 * @author hq
 */
public class CriteriaMild implements Criteria{
    /**
     * 获取程度温和的游乐设施
     */
    @Override
    public List<Facility> meetCriteria(List<Facility> facilities) {
        List<Facility> targetFacilities = new ArrayList<Facility>();
        for (Facility facility : facilities) {
            if(facility.getType().equalsIgnoreCase("mild")){
                targetFacilities.add(facility);
            }
        }
        return targetFacilities;
    }
}
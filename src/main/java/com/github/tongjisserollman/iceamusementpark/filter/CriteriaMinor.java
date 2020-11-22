package com.github.tongjisserollman.iceamusementpark.filter;

import java.util.ArrayList;
import java.util.List;
/**
 * @author hq
 */
public class CriteriaMinor implements Criteria{
    /**
     * 获取未成年人可玩的游乐设施
     */
    @Override
    public List<Facility> meetCriteria(List<Facility> facilities) {
        List<Facility> targetFacilities = new ArrayList<Facility>();
        for (Facility facility : facilities) {
            if(facility.getAgeLowerLimit() < 18){
                targetFacilities.add(facility);
            }
        }
        return targetFacilities;
    }
}

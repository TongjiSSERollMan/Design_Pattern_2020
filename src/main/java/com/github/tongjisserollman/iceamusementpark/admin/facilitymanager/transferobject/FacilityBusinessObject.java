package com.github.tongjisserollman.iceamusementpark.admin.facilitymanager.transferobject;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mrcopytuo
 *
 * 设施业务对象
 */

public class FacilityBusinessObject {
    private Map<Integer, FacilityTransferObject> FacilityMap;

    /**
     * FacilityBusinessObject构造器
     */
    public FacilityBusinessObject(){
        FacilityMap = new HashMap<Integer, FacilityTransferObject>();
        CallStackLogger.log(
                new CallStackLogInfo(
                        "FacilityBusinessObject",
                        "FacilityBusinessObject",
                        String.valueOf(System.identityHashCode(this)),
                        "FacilityBusinessObject构造器"
                )
        );
    }

    /**
     * 添加设施
     */
    public void addFacility(FacilityTransferObject facility){
        FacilityMap.put(facility.getId(),facility);
        CallStackLogger.log(
                new CallStackLogInfo(
                        "FacilityBusinessObject",
                        "addFacility",
                        String.valueOf(System.identityHashCode(this)),
                        "添加设施"
                )
        );
    }

    /**
     * 移除设施
     */
    public void deleteFacility(FacilityTransferObject facility){
        FacilityMap.remove(facility.getId());
        CallStackLogger.log(
                new CallStackLogInfo(
                        "FacilityBusinessObject",
                        "deleteFacility",
                        String.valueOf(System.identityHashCode(this)),
                        facility.getName()+"已经被移除"
                )
        );
    }

    /**
     * 获取设施表
     */
    public Map<Integer, FacilityTransferObject> getAllFacilitys(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "FacilityBusinessObject",
                        "getAllFacilities",
                        String.valueOf(System.identityHashCode(this)),
                        "获取设施表"
                )
        );
        return FacilityMap;
    }

    /**
     * 获取设施信息
     */
    public FacilityTransferObject getFacility(int id){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "FacilityBusinessObject",
                        "getFacility",
                        String.valueOf(System.identityHashCode(this)),
                        "获取设施信息"
                )
        );
        return FacilityMap.get(id);
    }

    /**
     * 更新设施数据
     */
    public void updateFacility(FacilityTransferObject facility){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "FacilityBusinessObject",
                        "updateFacility",
                        String.valueOf(System.identityHashCode(this)),
                        "更新设施数据"
                )
        );
        FacilityMap.put(facility.getId(),facility);
    }
}

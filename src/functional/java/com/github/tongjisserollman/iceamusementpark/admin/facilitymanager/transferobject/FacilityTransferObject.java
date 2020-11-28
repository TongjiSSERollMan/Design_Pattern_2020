package com.github.tongjisserollman.iceamusementpark.admin.facilitymanager.transferobject;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Mrcopytuo
 *
 * 设施传输对象
 */

public class FacilityTransferObject {
    private String name;
    private String job;
    private int id;

    /**
     * FacilityTransferObject构造器
     */
    public FacilityTransferObject(int id, String name, String job){
        this.name=name;
        this.job=job;
        this.id=id;
        CallStackLogger.log(
                new CallStackLogInfo(
                        "FacilityTransferObject",
                        "FacilityTransferObject",
                        String.valueOf(System.identityHashCode(this)),
                        "FacilityTransferObject构造器"
                )
        );
    }

    /**
     * 姓名getter
     */
    public String getName(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "FacilityTransferObject",
                        "getName",
                        String.valueOf(System.identityHashCode(this)),
                        "姓名getter"
                )
        );
        return name;
    }

    /**
     *ID getter
     */
    public int getId(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "FacilityTransferObject",
                        "getId",
                        String.valueOf(System.identityHashCode(this)),
                        "ID getter"
                )
        );
        return id;
    }

    /**
     *职业 getter
     */
    public String getJob(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "FacilityTransferObject",
                        "getJob",
                        String.valueOf(System.identityHashCode(this)),
                        "职业 getter"
                )
        );
        return job;
    }

    /**
     * 姓名setter
     */
    public void setName(String name){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "FacilityTransferObject",
                        "setName",
                        String.valueOf(System.identityHashCode(this)),
                        "姓名setter"
                )
        );
        this.name=name;
    }

    /**
     * ID setter
     */
    public void setId(int id){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "FacilityTransferObject",
                        "setId",
                        String.valueOf(System.identityHashCode(this)),
                        "ID setter"
                )
        );
        this.id=id;
    }

    /**
     * 职业 setter
     */
    public void  setJob(String job){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "FacilityTransferObject",
                        "setJob",
                        String.valueOf(System.identityHashCode(this)),
                        "职业 setter"
                )
        );
        this.job=job;
    }
}

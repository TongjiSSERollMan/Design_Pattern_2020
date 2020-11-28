package com.github.tongjisserollman.iceamusementpark.office.employeechannel.marker;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Mrcopytuo
 *
 * 员工类
 */

public class Worker implements Premission {
    private String name;
    private int id;

    /**
     * Worker构造器
     */
    public Worker(String name, int id){
        this.name = name;
        this.id = id;
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Worker",
                        "Worker",
                        String.valueOf(System.identityHashCode(this)),
                        "Worker构造器"
                )
        );
    }

    /**
     * 员工进入通道
     */
    public void enterAccess(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Worker",
                        "enterAccess",
                        String.valueOf(System.identityHashCode(this)),
                        "员工进入通道"
                )
        );
        System.out.println("员工id"+id+" 姓名"+name+",可以使用员工通道");
    }
}

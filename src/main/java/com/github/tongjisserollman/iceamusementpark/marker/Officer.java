package com.github.tongjisserollman.iceamusementpark.marker;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Mrcopytuo
 *
 * 上面来的领导
 */

public class Officer implements Premission {
    private String name;

    /**
     * Officer
     */
    public Officer(String name){
        this.name=name;
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Officer",
                        "Officer",
                        String.valueOf(System.identityHashCode(this)),
                        "Officer构造器"
                )
        );
    }

    /**
     * 领导进入通道
     */
    public void enterAccess(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Officer",
                        "enterAccess",
                        String.valueOf(System.identityHashCode(this)),
                        "领导进入通道"
                )
        );
        System.out.println("欢迎领导"+name+"莅临我司参观！");
    }
}

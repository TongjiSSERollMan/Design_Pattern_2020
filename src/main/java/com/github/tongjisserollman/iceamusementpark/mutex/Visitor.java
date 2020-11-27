package com.github.tongjisserollman.iceamusementpark.mutex;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author aodethri
 *
 * 游客类
 */
public class Visitor extends Thread {

    private final String name;

    private final WashRoom washRoom;

    public Visitor(String name, WashRoom washRoom){
        this.name = name;
        this.washRoom = washRoom;
    }

    @Override
    public void run() {
        washRoom.takeBean();
        String msg = name + "正在洗手间";
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Visitor",
                        "run",
                        String.valueOf(System.identityHashCode(this)),
                        msg
                )
        );

    }
}

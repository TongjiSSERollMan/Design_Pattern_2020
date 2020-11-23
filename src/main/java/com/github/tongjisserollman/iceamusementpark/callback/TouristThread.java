package com.github.tongjisserollman.iceamusementpark.callback;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author aodethri
 *
 * 简单游客线程类
 */
public class TouristThread extends BaseThreadHolder {

    @Override
    public void run() {
        String msg = "游客开始办理旅馆退房手续";

        CallStackLogger.log(
                new CallStackLogInfo(
                        "TouristThread",
                        "run",
                        String.valueOf(System.identityHashCode(this)),
                        msg
                )
        );
    }
}

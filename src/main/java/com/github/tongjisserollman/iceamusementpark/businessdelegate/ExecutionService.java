package com.github.tongjisserollman.iceamusementpark.businessdelegate;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author aodethri
 *
 * 董事会的执行服务
 */
public class ExecutionService implements DirectorsService {

    @Override
    public void run() {
        String msg = "执行股东大会的决议";

        CallStackLogger.log(
                new CallStackLogInfo(
                        "ExecutionService",
                        "run",
                        String.valueOf(System.identityHashCode(this)),
                        msg
                )
        );
    }
}

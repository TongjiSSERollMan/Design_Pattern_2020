package com.github.tongjisserollman.iceamusementpark.businessdelegate;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author aodethri
 *
 * 董事会的会议服务
 */
public class MeetingService implements DirectorsService {

    @Override
    public void run() {
        String msg = "召开股东大会并向股东大会报告工作";

        CallStackLogger.log(
                new CallStackLogInfo(
                        "MeetingService",
                        "run",
                        String.valueOf(System.identityHashCode(this)),
                        msg
                )
        );
    }
}

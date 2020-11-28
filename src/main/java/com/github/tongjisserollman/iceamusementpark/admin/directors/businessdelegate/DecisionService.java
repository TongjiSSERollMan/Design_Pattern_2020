package com.github.tongjisserollman.iceamusementpark.admin.directors.businessdelegate;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author aodethri
 *
 * 董事会的决策服务
 */
public class DecisionService implements DirectorsService {

    @Override
    public void run() {
        String msg = "进行决策，决定公司内部管理机构设置、决定公司经理去留等相关工作";

        CallStackLogger.log(
                new CallStackLogInfo(
                        "DecisionService",
                        "run",
                        String.valueOf(System.identityHashCode(this)),
                        msg
                )
        );
    }
}

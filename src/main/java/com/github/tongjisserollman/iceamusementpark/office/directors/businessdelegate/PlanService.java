package com.github.tongjisserollman.iceamusementpark.office.directors.businessdelegate;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author aodethri
 *
 * 董事会的计划服务
 */
public class PlanService implements DirectorsService {

    @Override
    public void run() {
        String msg = "指定公司的经营计划与方案，如利润分配方案、年度财务预算方案等";

        CallStackLogger.log(
                new CallStackLogInfo(
                        "PlanService",
                        "run",
                        String.valueOf(System.identityHashCode(this)),
                        msg
                )
        );
    }
}

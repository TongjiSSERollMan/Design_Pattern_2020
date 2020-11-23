package com.github.tongjisserollman.iceamusementpark.callback;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author aodethri
 *
 * 办理退房手续的结果回调
 */
public class ResultExporter implements CallBack {

    @Override
    public void call() {
        String msg = "办理退房手续成功，旅客离开旅店";

        CallStackLogger.log(
                new CallStackLogInfo(
                        "ResultExporter",
                        "call",
                        String.valueOf(System.identityHashCode(this)),
                        msg
                )
        );
    }
}

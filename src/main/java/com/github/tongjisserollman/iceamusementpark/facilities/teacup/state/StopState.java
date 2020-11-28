package com.github.tongjisserollman.iceamusementpark.facilities.teacup.state;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author aodethri
 *
 * 旋转茶杯的停止状态
 */
public class StopState implements State {

    @Override
    public void run(Teacup teacup) {
        String msg = "茶杯正处于停止状态";

        CallStackLogger.log(
                new CallStackLogInfo(
                        "StopState",
                        "run",
                        String.valueOf(System.identityHashCode(this)),
                        msg
                )
        );
    }
}

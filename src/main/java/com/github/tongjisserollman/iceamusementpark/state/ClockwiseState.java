package com.github.tongjisserollman.iceamusementpark.state;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author aodethri
 *
 * 旋转茶杯的顺时针旋转状态
 */
public class ClockwiseState implements State{

    @Override
    public void run(Teacup teacup) {
        String msg = "茶杯正处于顺时针旋转状态";

        CallStackLogger.log(
                new CallStackLogInfo(
                        "ClockwiseState",
                        "run",
                        String.valueOf(System.identityHashCode(this)),
                        msg
                )
        );
    }
}

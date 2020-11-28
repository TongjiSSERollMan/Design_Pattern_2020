package com.github.tongjisserollman.iceamusementpark.entertainment.teacup.state;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author aodethri
 *
 * 茶杯的逆时针旋转状态
 */
public class CounterclockwiseState implements State {

    @Override
    public void run(Teacup teacup) {
        String msg = "茶杯正处于逆时针旋转状态";

        CallStackLogger.log(
                new CallStackLogInfo(
                        "CounterclockwiseState",
                        "run",
                        String.valueOf(System.identityHashCode(this)),
                        msg
                )
        );
    }
}

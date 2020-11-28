package com.github.tongjisserollman.iceamusementpark.stage.animalshow.delegate;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author aodethri
 *
 * 猴子表演节目
 */
public class MonkeyShow implements Show {

    @Override
    public void startShow() {
        String msg = "现在是猴子在表演节目";

        CallStackLogger.log(
                new CallStackLogInfo(
                        "MonkeyShow",
                        "startShow",
                        String.valueOf(System.identityHashCode(this)),
                        msg
        ));
    }
}

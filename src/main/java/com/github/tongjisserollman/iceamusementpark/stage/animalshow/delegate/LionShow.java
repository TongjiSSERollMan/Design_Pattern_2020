package com.github.tongjisserollman.iceamusementpark.stage.animalshow.delegate;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author aodethri
 *
 * 狮子表演节目
 */
public class LionShow implements Show {

    @Override
    public void startShow() {
        String msg = "现在是狮子在表演节目";

        CallStackLogger.log(
                new CallStackLogInfo(
                        "LionShow",
                        "startShow",
                        String.valueOf(System.identityHashCode(this)),
                        msg
                )
        );
    }
}

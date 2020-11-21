package com.github.tongjisserollman.iceamusementpark.factory;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author zactWu
 *
 * 香肠
 */
public class Sausage implements Snack{

    /**
     * 制造香肠
     */
    @Override
    public void make() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Sausage",
                        "make",
                        String.valueOf(System.identityHashCode(this)),
                        "制造一根香肠"
                )
        );
    }
}

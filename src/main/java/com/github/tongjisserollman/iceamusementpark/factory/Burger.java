package com.github.tongjisserollman.iceamusementpark.factory;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author zactWu
 *
 * 汉堡
 */
public class Burger implements Snack{

    /**
     * 制造汉堡
     */
    @Override
    public void make() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Burger",
                        "make",
                        String.valueOf(System.identityHashCode(this)),
                        "制造一个汉堡"
                )
        );
    }
}

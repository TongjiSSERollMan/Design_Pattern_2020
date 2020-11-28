package com.github.tongjisserollman.iceamusementpark.shoppingmall.snack.factory;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author zactWu
 *
 * 爆米花
 */
public class Popcorn implements Snack{

    /**
     * 制造爆米花
     */
    @Override
    public void make() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Popcorn",
                        "make",
                        String.valueOf(System.identityHashCode(this)),
                        "制造一个爆米花"
                )
        );
    }
}

package com.github.tongjisserollman.iceamusementpark.singleton;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Moreonenight
 *
 * 游乐场本身
 */
public enum AmusementPark {
    // 用枚举类型实现单例模式
    INSTANCE;
    public static AmusementPark getInstance(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "AmusementPark",
                        "getInstance",
                        String.valueOf(System.identityHashCode(INSTANCE)),
                        "获取冰雪游乐场这一单例"
                )
        );
        return INSTANCE;
    }
}

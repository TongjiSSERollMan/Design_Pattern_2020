package com.github.tongjisserollman.iceamusementpark.nullobject;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Mrcopytuo
 *
 * 演员空对象
 */

public class NullActor extends AbstractActor {
    @Override
    public boolean isNull() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "NullActor",
                        "isNull",
                        String.valueOf(System.identityHashCode(this)),
                        "判断是否为空对象"
                )
        );
        return true;
    }

    @Override
    public String getName() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "NullActor",
                        "getName",
                        String.valueOf(System.identityHashCode(this)),
                        "获取空对象名"
                )
        );
        return "...哦，现在没有人为我们表演，大家可以自由使用舞台！";
    }

}

package com.github.tongjisserollman.iceamusementpark.nullobject;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

public class ActorFactory {
    public static final String[] names = {"歌唱家哈利","魔术师赫敏","角斗士罗恩"};

    public static AbstractActor getActor(String name){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "ActorFactory",
                        "AbstractActor",
                        "1154687952",
                        "生成对应演员（如果有的话）"
                )
        );
        for (String s : names) {
            if (s.equalsIgnoreCase(name)) {
                return new RealActor(name);
            }
        }
        return new NullActor();
    }
}

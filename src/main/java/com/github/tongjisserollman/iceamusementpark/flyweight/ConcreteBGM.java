package com.github.tongjisserollman.iceamusementpark.flyweight;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;
/**
 * @author hq
 */
public class ConcreteBGM implements BGM {
    private  String name;
    public ConcreteBGM(String name){
        this.name = name;
    }

    @Override
    public void use() {
        System.out.println("BGM:" + name);
//        CallStackLogger.log(
//                new CallStackLogInfo(
//                        "ConcreteBGM",
//                        "use",
//                        String.valueOf(System.identityHashCode(this)),
//                        "Add BGM"
//                )
//        );
    }
}

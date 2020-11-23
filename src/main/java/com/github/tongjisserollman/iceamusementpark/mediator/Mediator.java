package com.github.tongjisserollman.iceamusementpark.mediator;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

public class Mediator {
    public static void tellLack(Shop shop, String str){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Mediator",
                        "tellLack",
                        "1145141515",
                        "中介系统发布需求消息"
                )
        );
        System.out.println("商店名："+shop.getName()+"\t需求："+str);
    }
}

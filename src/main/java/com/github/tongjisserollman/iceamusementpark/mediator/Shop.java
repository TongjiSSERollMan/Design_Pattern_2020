package com.github.tongjisserollman.iceamusementpark.mediator;


import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

public class Shop {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String str){
        this.name=str;
    }
    public Shop(String str){
        this.name=str;
    }
    public void sendLackMessage(String str){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Shop",
                        "sendLackMessage",
                        String.valueOf(System.identityHashCode(this)),
                        "商店汇报自己的缺货信息"
                )
        );
        Mediator.tellLack(this,str);
    }
}

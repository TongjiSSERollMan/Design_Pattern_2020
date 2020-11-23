package com.github.tongjisserollman.iceamusementpark.mediator;


import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Mrcopytuo
 *
 * 商店类
 */

public class Shop {
    private String name;

    /**
     * 商店名getter
     */
    public String getName(){
        return name;
    }

    /**
     * 商店名setter
     */
    public void setName(String str){
        this.name=str;
    }

    /**
     * Shop构造器
     */
    public Shop(String str){
        this.name=str;
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Shop",
                        "Shop",
                        String.valueOf(System.identityHashCode(this)),
                        "Shop构造器"
                )
        );
    }

    /**
     * 商店汇报自己的缺货信息
     */
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

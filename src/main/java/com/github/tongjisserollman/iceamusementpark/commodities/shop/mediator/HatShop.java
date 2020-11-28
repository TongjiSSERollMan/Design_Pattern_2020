package com.github.tongjisserollman.iceamusementpark.commodities.shop.mediator;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Mrcopytuo
 *
 * 帽子商店类
 */

public class HatShop extends Shop{

    /**
     * HatShop构造器
     */
    public HatShop(String str){
        super(str);
        CallStackLogger.log(
                new CallStackLogInfo(
                        "HatShop",
                        "HatShop",
                        String.valueOf(System.identityHashCode(this)),
                        "HatShop构造器"
                )
        );
    }

    /**
     * 商店名getter
     */
    public String getName(){
        return "帽子商店-"+name;
    }
}

package com.github.tongjisserollman.iceamusementpark.commodities.shop.mediator;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Mrcopytuo
 *
 * 冰淇淋商店类
 */


public class IcecreamShop extends Shop{

    /**
     * IcecreamShop构造器
     */
    public IcecreamShop(String str){
        super(str);
        CallStackLogger.log(
                new CallStackLogInfo(
                        "IcecreamShop",
                        "IcecreamShop",
                        String.valueOf(System.identityHashCode(this)),
                        "IcecreamShop构造器"
                )
        );
    }

    /**
     * 商店名getter
     */
    public String getName(){
        return "冰淇淋商店-"+name;
    }
}

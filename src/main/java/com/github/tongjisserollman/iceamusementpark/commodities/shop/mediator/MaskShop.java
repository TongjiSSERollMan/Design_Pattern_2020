package com.github.tongjisserollman.iceamusementpark.commodities.shop.mediator;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Mrcopytuo
 *
 * 面具商店类
 */

public class MaskShop extends Shop {

    /**
     * MaskShop构造器
     */
    public MaskShop(String str){
        super(str);
        CallStackLogger.log(
                new CallStackLogInfo(
                        "MaskShop",
                        "MaskShop",
                        String.valueOf(System.identityHashCode(this)),
                        "MaskShop构造器"
                )
        );
    }

    /**
     * 商店名getter
     */
    public String getName(){
        return "面具商店-"+name;
    }


}

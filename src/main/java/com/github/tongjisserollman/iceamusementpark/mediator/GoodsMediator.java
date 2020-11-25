package com.github.tongjisserollman.iceamusementpark.mediator;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mrcopytuo
 *
 * 货物中介系统
 */

public class GoodsMediator implements Mediator {

    private final List<Shop> shops;

    /**
     * GoodsMediator构造器
     */
    public GoodsMediator() {
        shops=new ArrayList<Shop>();
        CallStackLogger.log(
                new CallStackLogInfo(
                        "GoodsMediator",
                        "GoodsMediator",
                        String.valueOf(System.identityHashCode(this)),
                        "GoodsMediator构造器"
                )
        );
    }

    /**
     * 中介系统记录新商店
     */
    @Override
    public void addShop(Shop shop) {
        shops.add(shop);
        CallStackLogger.log(
                new CallStackLogInfo(
                        "GoodsMediator",
                        "addShop",
                        String.valueOf(System.identityHashCode(this)),
                        "中介系统记录新商店"
                )
        );
    }

    /**
     * 中介系统发布需求消息
     */
    @Override
    public void tellMsg(Shop shop, String str){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Mediator",
                        "tellLack",
                        String.valueOf(System.identityHashCode(this)),
                        "中介系统发布需求消息"
                )
        );
        System.out.println(shop.getName()+"\t需求："+str);
        System.out.println();
        for(Shop oneShop : shops){
            if(!oneShop.equals(shop)){
                System.out.println(oneShop.getName()+"查看"+shop.getName()+"的需求");
            }
        }
    }
}

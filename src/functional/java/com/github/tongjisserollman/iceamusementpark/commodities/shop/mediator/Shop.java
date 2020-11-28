package com.github.tongjisserollman.iceamusementpark.commodities.shop.mediator;


import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Mrcopytuo
 *
 * 商店类
 */

public abstract class Shop {
    protected String name;
    protected GoodsMediator goodsMediator;

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
     * 中介系统getter
     */
    public GoodsMediator getGoodsMediator(){
        return goodsMediator;
    }

    /**
     * 设置商店的中介系统
     */
    public void setGoodsMediator(GoodsMediator goodsMediator){
        this.goodsMediator=goodsMediator;
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Shop",
                        "setGoodsMediator",
                        String.valueOf(System.identityHashCode(this)),
                        "设置商店的中介系统"
                )
        );
        goodsMediator.addShop(this);
    }

    /**
     * 商店汇报自己的需求信息
     */
    public void sendMessage(String str){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Shop",
                        "sendLackMessage",
                        String.valueOf(System.identityHashCode(this)),
                        "商店汇报自己的需求信息"
                )
        );
        goodsMediator.tellMsg(this,str);
    }

    /**
     * 商店查看其他商店的需求信息
     */
    public void readMessage(Shop shop){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Shop",
                        "readMessage",
                        String.valueOf(System.identityHashCode(this)),
                        "商店查看其他商店的需求信息"
                )
        );
        System.out.println(this.getName()+"查看了"+shop.getName()+"的需求信息");
    }
}

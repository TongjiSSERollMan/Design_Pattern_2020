package com.github.tongjisserollman.iceamusementpark.office.goodsmanager.transferobject;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mrcopytuo
 *
 * 设施业务对象
 */

public class GoodsBusinessObject {
    private Map<Integer,GoodsTransferObject> goodMap;

    /**
     * GoodBusinessObject构造器
     */
    public GoodsBusinessObject(){
        goodMap = new HashMap<Integer, GoodsTransferObject>();
        CallStackLogger.log(
                new CallStackLogInfo(
                        "GoodBusinessObject",
                        "GoodBusinessObject",
                        String.valueOf(System.identityHashCode(this)),
                        "GoodBusinessObject构造器"
                )
        );
    }

    /**
     * 添加货物
     */
    public void addGood(GoodsTransferObject good){
        goodMap.put(good.getId(),good);
        CallStackLogger.log(
                new CallStackLogInfo(
                        "GoodBusinessObject",
                        "addGood",
                        String.valueOf(System.identityHashCode(this)),
                        "添加货物"
                )
        );
    }

    /**
     * 移除货物
     */
    public void deleteGood(GoodsTransferObject good){
        goodMap.remove(good.getId());
        CallStackLogger.log(
                new CallStackLogInfo(
                        "GoodBusinessObject",
                        "deleteGood",
                        String.valueOf(System.identityHashCode(this)),
                        "移除货物"
                )
        );
        System.out.println(good.getName()+" 已经被移除");
    }

    /**
     * 获取货物表
     */
    public Map<Integer,GoodsTransferObject> getAllGoods(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "GoodBusinessObject",
                        "getAllGoods",
                        String.valueOf(System.identityHashCode(this)),
                        "获取货物表"
                )
        );
        return goodMap;
    }

    /**
     * 获取货物信息
     */
    public GoodsTransferObject getGood(int id){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "GoodBusinessObject",
                        "getGoods",
                        String.valueOf(System.identityHashCode(this)),
                        "获取货物信息"
                )
        );
        return goodMap.get(id);
    }

    /**
     * 更新货物数据
     */
    public void updateGood(GoodsTransferObject good){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "GoodBusinessObject",
                        "getGoods",
                        String.valueOf(System.identityHashCode(this)),
                        "更新货物数据"
                )
        );
        goodMap.put(good.getId(),good);
        System.out.println("货物数据已更新");
    }
}
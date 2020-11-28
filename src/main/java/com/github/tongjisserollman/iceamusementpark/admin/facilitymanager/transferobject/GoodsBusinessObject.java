package com.github.tongjisserollman.iceamusementpark.admin.facilitymanager.transferobject;

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
    //private List<GoodsTransferObject> goods;
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
    public void addWorker(GoodsTransferObject good){
        goodMap.put(good.getId(),good);
        CallStackLogger.log(
                new CallStackLogInfo(
                        "GoodBusinessObject",
                        "addWorker",
                        String.valueOf(System.identityHashCode(this)),
                        "添加货物"
                )
        );
    }

    /**
     * 移除货物
     */
    public void deleteWorker(GoodsTransferObject good){
        goodMap.remove(good.getId());
        CallStackLogger.log(
                new CallStackLogInfo(
                        "GoodBusinessObject",
                        "deleteWorker",
                        String.valueOf(System.identityHashCode(this)),
                        "移除货物"
                )
        );
        System.out.println(good.getName()+" 已经被移除");
    }

    /**
     * 获取货物表
     */
    public Map<Integer,GoodsTransferObject> getAllWorkers(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "GoodBusinessObject",
                        "getAllWorkers",
                        String.valueOf(System.identityHashCode(this)),
                        "获取货物表"
                )
        );
        return goodMap;
    }

    /**
     * 获取货物信息
     */
    public GoodsTransferObject getWorker(int id){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "GoodBusinessObject",
                        "getWorkers",
                        String.valueOf(System.identityHashCode(this)),
                        "获取货物信息"
                )
        );
        return goodMap.get(id);
    }

    /**
     * 更新货物数据
     */
    public void updateWorker(GoodsTransferObject good){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "GoodBusinessObject",
                        "getWorkers",
                        String.valueOf(System.identityHashCode(this)),
                        "更新货物数据"
                )
        );
        goodMap.put(good.getId(),good);
        System.out.println("货物数据已更新");
    }
}
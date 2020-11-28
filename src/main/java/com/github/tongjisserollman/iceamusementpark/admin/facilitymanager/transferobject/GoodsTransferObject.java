package com.github.tongjisserollman.iceamusementpark.admin.facilitymanager.transferobject;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Mrcopytuo
 * <p>
 * 设施传输对象
 */

public class GoodsTransferObject {
    private String name;
    private int count;
    private int id;

    /**
     * GoodsTransferObject构造器
     */
    public GoodsTransferObject(int id, String name, int count) {
        this.name = name;
        this.count = count;
        this.id = id;
        CallStackLogger.log(
                new CallStackLogInfo(
                        "GoodsTransferObject",
                        "GoodsTransferObject",
                        String.valueOf(System.identityHashCode(this)),
                        "GoodsTransferObject构造器"
                )
        );
    }

    /**
     * 货物名getter
     */
    public String getName() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "GoodsTransferObject",
                        "getName",
                        String.valueOf(System.identityHashCode(this)),
                        "货物名getter"
                )
        );
        return name;
    }

    /**
     * ID getter
     */
    public int getId() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "GoodsTransferObject",
                        "getId",
                        String.valueOf(System.identityHashCode(this)),
                        "ID getter"
                )
        );
        return id;
    }

    /**
     * 数量 getter
     */
    public int getCount() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "GoodsTransferObject",
                        "getJob",
                        String.valueOf(System.identityHashCode(this)),
                        "数量 getter"
                )
        );
        return count;
    }

    /**
     * 货物名setter
     */
    public void setName(String name) {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "GoodsTransferObject",
                        "setName",
                        String.valueOf(System.identityHashCode(this)),
                        "货物名setter"
                )
        );
        this.name = name;
    }

    /**
     * ID setter
     */
    public void setId(int id) {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "GoodsTransferObject",
                        "setId",
                        String.valueOf(System.identityHashCode(this)),
                        "ID setter"
                )
        );
        this.id = id;
    }

    /**
     * 数量 setter
     */
    public void setCount(int count) {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "GoodsTransferObject",
                        "setJob",
                        String.valueOf(System.identityHashCode(this)),
                        "数量 setter"
                )
        );
        this.count = count;
    }
}
package com.github.tongjisserollman.iceamusementpark.command;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author zactWu
 *
 * 库存
 */
public class Stock {
    private String name;
    private int quantity;

    Stock(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }
    /**
     * 进货
     *
     */
    public void buy(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Stock",
                        "buy",
                        String.valueOf(System.identityHashCode(this)),
                        this.name+"买进了"+this.quantity+"的库存"
                )
        );
    }
    /**
     * 出库
     *
     */
    public void sell(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Stock",
                        "sell",
                        String.valueOf(System.identityHashCode(this)),
                        this.name+"卖出了"+this.quantity+"的库存"
                )
        );
    }
}


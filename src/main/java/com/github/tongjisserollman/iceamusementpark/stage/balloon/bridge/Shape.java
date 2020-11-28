package com.github.tongjisserollman.iceamusementpark.stage.balloon.bridge;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Mrcopytuo
 *
 * 形状类基类
 */

public abstract class Shape {
    protected MakeAPI makeAPI;

    /**
     * Shape构造器
     */
    protected Shape(MakeAPI makeAPI){
        this.makeAPI=makeAPI;
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Shape",
                        "Shape",
                        String.valueOf(System.identityHashCode(this)),
                        "Shape构造器"
                )
        );
    }

    /**
     * 制作气球函数
     */
    public abstract void make();
}

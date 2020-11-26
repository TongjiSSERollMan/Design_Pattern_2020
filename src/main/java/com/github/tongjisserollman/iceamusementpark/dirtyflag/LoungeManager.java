package com.github.tongjisserollman.iceamusementpark.dirtyflag;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Mrcopytuo
 *
 * 休息间管理员类
 */

public class LoungeManager {
    private Lounge loungeInCharge;

    /**
     * LoungeManager构造器
     */
    public LoungeManager(Lounge loungeInCharge){
        this.loungeInCharge=loungeInCharge;
        CallStackLogger.log(
                new CallStackLogInfo(
                        "LoungeManager",
                        "LoungeManager",
                        String.valueOf(System.identityHashCode(this)),
                        "LoungeManager构造器"
                )
        );
    }

    /**
     * 设置管理的休息室
     */
    public void setLoungeInCharge(Lounge loungeInCharge){
        this.loungeInCharge=loungeInCharge;
        CallStackLogger.log(
                new CallStackLogInfo(
                        "LoungeManager",
                        "setLoungeInCharge",
                        String.valueOf(System.identityHashCode(this)),
                        "设置管理的休息室"
                )
        );
    }

    /**
     * 管理员检查并上报维护费用
     */
    public void reportFee(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "LoungeManager",
                        "reportFee",
                        String.valueOf(System.identityHashCode(this)),
                        "管理员检查并上报维护费用"
                )
        );
        System.out.println("管理员上报了" + loungeInCharge.calculateFee() + "的维护费用");
    }
}

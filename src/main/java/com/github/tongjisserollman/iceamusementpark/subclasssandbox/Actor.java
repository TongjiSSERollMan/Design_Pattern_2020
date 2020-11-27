package com.github.tongjisserollman.iceamusementpark.subclasssandbox;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author aodethri
 *
 * 选择角色
 */
public abstract class Actor {

    /**
     * 行动函数
     */
    protected abstract void activate();

    /**
     * 控制人物移动
     * @param x 目标位置的横坐标
     * @param y 目标位置的纵坐标
     */
    protected void move(double x, double y){
        String msg = "人物移动到了("+x+","+y+")位置";

        CallStackLogger.log(
                new CallStackLogInfo(
                        "Actor",
                        "move",
                        String.valueOf(System.identityHashCode(this)),
                        msg
                )
        );
    }

    /**
     * 控制人物向正前方攻击
     */
    protected void attack(){
        String msg = "人物向自身正前方攻击";

        CallStackLogger.log(
                new CallStackLogInfo(
                        "Actor",
                        "attack",
                        String.valueOf(System.identityHashCode(this)),
                        msg
                )
        );
    }

    /**
     * 控制人物进行欢呼
     */
    protected void cheer(String content){
        String msg = "人物正在欢呼:" + content;

        CallStackLogger.log(
                new CallStackLogInfo(
                        "Actor",
                        "cheer",
                        String.valueOf(System.identityHashCode(this)),
                        msg
                )
        );
    }
}

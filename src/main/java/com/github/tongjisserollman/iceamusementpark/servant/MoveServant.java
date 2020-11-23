package com.github.tongjisserollman.iceamusementpark.servant;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Major333
 *
 * 移动花卉的雇员
 */
public class MoveServant {

    /**
     * 实现可以移动的服务,根据绝对位置
     *
     * @param serviced 需要被实现的移动服务
     * @param where 移动到的新地点
     */
    public void moveTo(Movable serviced, Position where) {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "MoveServant",
                        "moveTo",
                        String.valueOf(System.identityHashCode(this)),
                        "实现移动服务"
                )
        );
        serviced.setPosition(where);
    }

}

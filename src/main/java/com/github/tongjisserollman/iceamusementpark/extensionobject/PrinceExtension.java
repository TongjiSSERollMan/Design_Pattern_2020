package com.github.tongjisserollman.iceamusementpark.extensionobject;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author rand1925
 *
 * 王子扩展类
 */
public class PrinceExtension extends AbstractExtension{
    /**
     * 以特定角色创建王子扩展类
     */
    public PrinceExtension(Role role) {
        super(role);
        CallStackLogger.log(new CallStackLogInfo(
                "PrinceExtension",
                "PrinceExtension",
                String.valueOf(System.identityHashCode(this)),
                String.format("为%s创建王子扩展对象", role.getName())
        ));
    }

    /**
     * 作为王子行礼
     */
    public void greet() {
        CallStackLogger.log(new CallStackLogInfo(
                "PrinceExtension",
                "greet",
                String.valueOf(System.identityHashCode(this)),
                owner.getName() + "作为王子行礼"
        ));
    }
}

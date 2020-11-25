package com.github.tongjisserollman.iceamusementpark.extensionobject;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author rand1925
 */
public class PrinceWarriorRole extends Role {
    /**
     * 创建特定名字的角色
     *
     * @param name 角色名
     */
    PrinceWarriorRole(String name) {
        super(name);
        CallStackLogger.log(new CallStackLogInfo(
                "PrinceWarriorRole",
                "PrinceWarriorRole",
                String.valueOf(System.identityHashCode(this)),
                String.format("创建名为%s的王子战士角色", name)
        ));

        addExtension(PrinceExtension.class.getName());
        addExtension(WarriorExtension.class.getName());
    }
}



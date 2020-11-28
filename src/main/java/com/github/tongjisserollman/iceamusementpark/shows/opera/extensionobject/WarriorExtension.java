package com.github.tongjisserollman.iceamusementpark.shows.opera.extensionobject;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author rand1925
 *
 * 战士扩展类
 */
public class WarriorExtension extends AbstractExtension {
    /**
     * 以特定角色创建战士扩展类
     */
    public WarriorExtension(Role role) {
        super(role);
        CallStackLogger.log(new CallStackLogInfo(
                "WarriorExtension",
                "WarriorExtension",
                String.valueOf(System.identityHashCode(this)),
                String.format("为%s创建战士扩展对象", role.getName())
        ));
    }

    /**
     * 作为战士战斗行礼
     */
    public void fight() {
        CallStackLogger.log(new CallStackLogInfo(
                "WarriorExtension",
                "fight",
                String.valueOf(System.identityHashCode(this)),
                owner.getName() + "作为战士战斗"
        ));
    }
}

package com.github.tongjisserollman.iceamusementpark.extensionobject;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author rand1925
 *
 * 归属于角色的抽象扩展类
 */
public class AbstractExtension implements Extension{
    protected Role owner;

    /**
     * 以特定拥有者创建扩展对象
     *
     * @param role 归属角色
     */
    public AbstractExtension(Role role) {
        this.owner = role;
    }
}

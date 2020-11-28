package com.github.tongjisserollman.iceamusementpark.stage.actor.nullobject;

/**
 * @author Mrcopytuo
 *
 * 演员基类
 */

public abstract class AbstractActor {
    protected String name;

    /**
     * 判断是否为空对象
     */
    public abstract boolean isNull();

    /**
     * 获取对象名
     */
    public abstract String getName();
}

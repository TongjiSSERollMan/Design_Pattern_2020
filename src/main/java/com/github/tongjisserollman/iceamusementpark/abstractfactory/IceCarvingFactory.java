package com.github.tongjisserollman.iceamusementpark.abstractfactory;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Moreonenight
 *
 * 不同类型（A对应浮雕，B对应圆雕）的冰雕园地
 */
public abstract class IceCarvingFactory {
    /**
     * 创建冰雕的方法
     *
     * @param carvedName 冰雕的名字，用以展示
     * @return 创建的冰雕
     *
     */
    public abstract CarvedPeople createCarvedPeople(String carvedName);
    public abstract CarvedThings createCarvedThings(String carvedName);
}

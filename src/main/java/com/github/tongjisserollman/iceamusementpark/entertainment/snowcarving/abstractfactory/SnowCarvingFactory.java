package com.github.tongjisserollman.iceamusementpark.entertainment.snowcarving.abstractfactory;

/**
 * @author Moreonenight
 *
 * 不同类型（A对应浮雕，B对应圆雕）的雪雕园地
 */
public abstract class SnowCarvingFactory {
    /**
     * 创建人形雪雕的方法
     *
     * @param carvedName 雪雕的名字，用以展示
     * @return 创建的雪雕
     *
     */
    public abstract CarvedPeople createCarvedPeople(String carvedName);
    /**
     * 创建物品状雪雕的方法
     *
     * @param carvedName 雪雕的名字，用以展示
     * @return 创建的雪雕
     *
     */
    public abstract CarvedThings createCarvedThings(String carvedName);
}

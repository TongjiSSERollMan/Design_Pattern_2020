package com.github.tongjisserollman.iceamusementpark.abstractfactory;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Moreonenight
 *
 * 创建不同类型的游乐设施
 */
public abstract class FacilityFactory {
    public static FacilityFactory getFactory(String classname) {
        FacilityFactory factory = null;
        try {
            factory = (FacilityFactory)Class.forName(classname).getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            System.err.println("未找到要求的类或方法。");
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return factory;
    }
    /**
     * 创建设施的方法
     *
     * @param facilityId 设施的编号，应当在全游乐场范围内唯一
     * @param facilityName 设施的名字，用以招徕顾客
     * @return Facility Created
     *
     */
    public abstract Facility createFacility(int facilityId, String facilityName);
}

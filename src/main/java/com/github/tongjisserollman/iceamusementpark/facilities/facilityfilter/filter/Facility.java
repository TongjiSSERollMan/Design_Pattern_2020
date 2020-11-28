package com.github.tongjisserollman.iceamusementpark.facilities.facilityfilter.filter;

/**
 * @author hq
 */
public class Facility {
    /**
     * 创建游乐设施（名字、年龄下限、类型）
     */
    private String name;
    private int ageLowerLimit;
    private String type;

    public Facility(String name,int ageUpper,String type){
        this.name = name;
        this.ageLowerLimit = ageUpper;
        this.type = type;
    }
    /**
     * 获取游乐设施名称
     * @return 游乐设施名称
     */
    public String getName() {
        return name;
    }
    /**
     * 获取游乐设施年龄限制
     * @return 游乐设施年龄限制
     */
    public int getAgeLowerLimit() {
        return ageLowerLimit;
    }
    /**
     * 获取游乐设施类型
     * @return 游乐设施类型
     */
    public String getType() {
        return type;
    }
}

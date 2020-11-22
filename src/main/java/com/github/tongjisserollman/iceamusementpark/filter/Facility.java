package com.github.tongjisserollman.iceamusementpark.filter;

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

    public String getName() {
        return name;
    }
    public int getAgeLowerLimit() {
        return ageLowerLimit;
    }
    public String getType() {
        return type;
    }
}

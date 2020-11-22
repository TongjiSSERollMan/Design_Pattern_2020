package com.github.tongjisserollman.iceamusementpark.abstractfactory;
/**
 * @author Moreonenight
 *
 * 不同类型的游乐设施
 */
public abstract class Facility {
    protected int facilityId;
    protected String facilityName;
    public Facility(int facilityId, String facilityName) {
        this.facilityId = facilityId;
        this.facilityName = facilityName;
    }
    /**
     * 运行设施
     */
    public abstract void run();
}

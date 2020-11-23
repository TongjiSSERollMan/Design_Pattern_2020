package com.github.tongjisserollman.iceamusementpark.visitor;

public interface FacilityPart {
    /**
     * @param facilityPartVisitor 访问工具
     */
    public void accept(FacilityPartVisitor facilityPartVisitor);
}

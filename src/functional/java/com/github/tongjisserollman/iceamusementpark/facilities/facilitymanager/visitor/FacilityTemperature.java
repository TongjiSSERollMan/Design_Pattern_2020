package com.github.tongjisserollman.iceamusementpark.facilities.facilitymanager.visitor;

public class FacilityTemperature implements FacilityPart {
    /**
     * @param facilityPartVisitor 访问工具
     */
    @Override
    public void accept(FacilityPartVisitor facilityPartVisitor) {
        facilityPartVisitor.visit(this);
    }
}

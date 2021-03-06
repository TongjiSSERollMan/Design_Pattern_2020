package com.github.tongjisserollman.iceamusementpark.entertainment.facilitymanager.visitor;

public class FacilityPower implements FacilityPart {
    /**
     * @param facilityPartVisitor 访问工具
     */
    @Override
    public void accept(FacilityPartVisitor facilityPartVisitor) {
        facilityPartVisitor.visit(this);
    }
}

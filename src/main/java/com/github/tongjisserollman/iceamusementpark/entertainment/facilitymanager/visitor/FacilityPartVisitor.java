package com.github.tongjisserollman.iceamusementpark.entertainment.facilitymanager.visitor;

/**
 * @author xuedixuedi
 */
public interface FacilityPartVisitor {
    public void visit(FacilityTemperature facilityTemperature);

    public void visit(FacilityPower facilityPower);

    public void visit(FacilityUsage facilityUsage);

    public void visit(Facility facility);
}

package com.github.tongjisserollman.iceamusementpark.visitor;

import static org.junit.jupiter.api.Assertions.*;

class FacilityPartDisplayVisitorTest {
    @org.junit.jupiter.api.Test
    public void FacilityPartDisplayVisitorTest() {
        Facility facility = new Facility();
        facility.accept(new FacilityPartDisplayVisitor());
    }

}
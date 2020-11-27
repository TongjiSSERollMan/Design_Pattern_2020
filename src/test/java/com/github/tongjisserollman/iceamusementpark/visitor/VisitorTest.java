package com.github.tongjisserollman.iceamusementpark.visitor;

import static org.junit.jupiter.api.Assertions.*;

class VisitorTest {
    @org.junit.jupiter.api.Test
    public void testVisitor() {
        Facility facility = new Facility();
        facility.accept(new FacilityPartDisplayVisitor());
    }

}
package com.github.tongjisserollman.iceamusementpark.visitor;

import com.github.tongjisserollman.iceamusementpark.facilities.facilitymanager.visitor.Facility;
import com.github.tongjisserollman.iceamusementpark.facilities.facilitymanager.visitor.FacilityPartDisplayVisitor;
import org.junit.jupiter.api.Test;

class VisitorTest {

    @Test
    public void testVisitor() {
        Facility facility = new Facility();
        facility.accept(new FacilityPartDisplayVisitor());
    }

}
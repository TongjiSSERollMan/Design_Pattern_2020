package com.github.tongjisserollman.iceamusementpark.visitor;

import static org.junit.jupiter.api.Assertions.*;

class FacilityPartDisplayVisitorTest {
    public static void main(String[] args) {
        Facility facility = new Facility();
        facility.accept(new FacilityPartDisplayVisitor());
    }

}
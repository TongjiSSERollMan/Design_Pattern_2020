package com.github.tongjisserollman.iceamusementpark.specification;

import org.junit.jupiter.api.Test;

public class SpecificationTest {
    @Test
    void visitorSpecTest() {
        Visitor[] visitors = {
                new Visitor("lxd", 10, 168.5, Gender.FEMALE),
                new Visitor("wzj", 20, 182, Gender.MALE),
                new Visitor("zz", 90, 125, Gender.MALE)
        };

        Specification<Visitor> spec1 = new VisitorGenderSpec(Gender.FEMALE).and(new VisitorAgeLessThanSpec(80));
        Specification<Visitor> spec2 = new VisitorHeightLessThanSpec(170).not();
        Specification<Visitor> spec3 = new VisitorAgeLessThanSpec(18).or(new VisitorAgeLessThanSpec(80).not());

        spec1.isSatisfiedBy(visitors[0]);
        spec2.isSatisfiedBy(visitors[1]);
        spec3.isSatisfiedBy(visitors[2]);
    }
}

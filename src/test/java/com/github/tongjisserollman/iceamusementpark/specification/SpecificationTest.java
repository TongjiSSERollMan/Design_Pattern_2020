package com.github.tongjisserollman.iceamusementpark.specification;

import com.github.tongjisserollman.iceamusementpark.util.Gender;
import com.github.tongjisserollman.iceamusementpark.util.Visitor;
import org.junit.jupiter.api.Test;

public class SpecificationTest {
    @Test
    void testSpecification() {
        Visitor[] visitors = {
                new Visitor("lxd").setAge(10).setHeight(168.5).setGender(Gender.FEMALE),
                new Visitor("wzj").setAge(20).setHeight(182).setGender(Gender.MALE),
                new Visitor("zz").setAge(90).setHeight(125).setGender(Gender.FEMALE),
        };

        Specification<Visitor> spec1 = new VisitorGenderSpec(Gender.FEMALE).and(new VisitorAgeLessThanSpec(80));
        Specification<Visitor> spec2 = new VisitorHeightLessThanSpec(170).not();
        Specification<Visitor> spec3 = new VisitorAgeLessThanSpec(18).or(new VisitorAgeLessThanSpec(80).not());

        spec1.isSatisfiedBy(visitors[0]);
        spec2.isSatisfiedBy(visitors[1]);
        spec3.isSatisfiedBy(visitors[2]);
    }
}

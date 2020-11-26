package com.github.tongjisserollman.iceamusementpark.decorator;

import org.junit.jupiter.api.Test;
/**
 * @author hq
 */
public class DecoratorTest {

    @Test
    void displayTest(){
        Facility f0 = new FacilityOriginal();
        f0.display();
        Facility f1 = new FacilityWall(f0);
        f1.display();
        Facility f2 = new FacilityTiming(f0);
        f2.display();
    }
}

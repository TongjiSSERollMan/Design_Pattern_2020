package com.github.tongjisserollman.iceamusementpark.decorator;

import com.github.tongjisserollman.iceamusementpark.facilities.wall.decorator.Facility;
import com.github.tongjisserollman.iceamusementpark.facilities.wall.decorator.FacilityOriginal;
import com.github.tongjisserollman.iceamusementpark.facilities.wall.decorator.FacilityTiming;
import com.github.tongjisserollman.iceamusementpark.facilities.wall.decorator.FacilityWall;
import org.junit.jupiter.api.Test;
/**
 * @author hq
 */
public class DecoratorTest {

    @Test
    void testDecorator(){
        Facility f0 = new FacilityOriginal();
        f0.display();
        Facility f1 = new FacilityWall(f0);
        f1.display();
        Facility f2 = new FacilityTiming(f0);
        f2.display();
    }
}

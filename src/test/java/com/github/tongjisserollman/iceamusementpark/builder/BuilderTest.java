package com.github.tongjisserollman.iceamusementpark.builder;

import com.github.tongjisserollman.iceamusementpark.commodities.smoothie.builder.*;
import org.junit.jupiter.api.Test;

class BuilderTest {

    @Test
    void testBuilder() {
        SmoothieDirector smoothieDirector = new SmoothieDirector();

        SmoothieBuilder bigAppleSmoothieBuilder = new BigAppleSmoothieBuilder();
        smoothieDirector.setSmoothieBuilder(bigAppleSmoothieBuilder);
        smoothieDirector.construct();
        Smoothie bigAppleSmoothie = bigAppleSmoothieBuilder.build();
        bigAppleSmoothie.eat();

        SmoothieBuilder smallLemonSmoothieBuilder = new SmallLemonSmoothieBuilder();
        smoothieDirector.setSmoothieBuilder(smallLemonSmoothieBuilder);
        smoothieDirector.construct();
        Smoothie smallLemonSmoothie = smallLemonSmoothieBuilder.build();
        smallLemonSmoothie.eat();

    }
}
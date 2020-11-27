package com.github.tongjisserollman.iceamusementpark.builder;

import static org.junit.jupiter.api.Assertions.*;

class BuilderTest {

    @org.junit.jupiter.api.Test
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
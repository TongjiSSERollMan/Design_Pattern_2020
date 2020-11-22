package com.github.tongjisserollman.iceamusementpark.strategy;

import org.junit.jupiter.api.Test;

public class StrategyTest {
    @Test
    void skiStrategyTest() {
        Skier skier = new Skier(new SinglePlateSki(), "cxf");
        skier.ski();

        skier.setSkiStrategy(new DoublePlateSki());
        skier.ski();
    }
}

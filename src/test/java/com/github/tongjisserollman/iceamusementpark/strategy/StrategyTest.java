package com.github.tongjisserollman.iceamusementpark.strategy;

import com.github.tongjisserollman.iceamusementpark.facilities.skiing.strategy.DoublePlateSki;
import com.github.tongjisserollman.iceamusementpark.facilities.skiing.strategy.SinglePlateSki;
import com.github.tongjisserollman.iceamusementpark.util.Visitor;
import org.junit.jupiter.api.Test;

public class StrategyTest {
    @Test
    void testStrategy() {
        Visitor skier = new Visitor("cxf").setSkiStrategy(new SinglePlateSki());
        skier.ski();

        skier.setSkiStrategy(new DoublePlateSki());
        skier.ski();
    }
}

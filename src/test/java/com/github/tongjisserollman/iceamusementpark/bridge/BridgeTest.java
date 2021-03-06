package com.github.tongjisserollman.iceamusementpark.bridge;

import com.github.tongjisserollman.iceamusementpark.stage.balloon.bridge.*;
import org.junit.jupiter.api.Test;

class BridgeTest {

    @Test
    void testBridge(){
        System.out.println("桥接模式测试：");
        Shape dogRedBalloon = new DogShape(new RedBalloon());
        Shape planeBlueBalloon = new PlaneShape(new BlueBalloon());

        dogRedBalloon.make();
        planeBlueBalloon.make();
    }
}
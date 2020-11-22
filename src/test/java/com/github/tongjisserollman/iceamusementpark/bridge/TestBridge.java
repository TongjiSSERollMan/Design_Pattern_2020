package com.github.tongjisserollman.iceamusementpark.bridge;

import static org.junit.jupiter.api.Assertions.*;

class TestBridge {
    @org.junit.jupiter.api.Test
    void TestBallon(){
        System.out.println("桥接模式测试：");
        Shape dogRedBalloon = new DogShape(new RedBalloon());
        Shape planeBlueBalloon = new PlaneShape(new BlueBalloon());

        dogRedBalloon.make();
        planeBlueBalloon.make();
    }
}
package com.github.tongjisserollman.iceamusementpark.bridge;

public class RedBalloon implements MakeAPI{
    @Override
    public void makeBalloon(String shape) {
        System.out.println("小丑做了一个红色的"+shape+"形状的的气球");
    }

}
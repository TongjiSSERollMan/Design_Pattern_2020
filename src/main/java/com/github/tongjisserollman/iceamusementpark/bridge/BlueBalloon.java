package com.github.tongjisserollman.iceamusementpark.bridge;

public class BlueBalloon implements MakeAPI{
    @Override
    public void makeBalloon(String shape) {
        System.out.println("小丑做了一个蓝色的"+shape+"形状的气球");
    }

}
package com.github.tongjisserollman.iceamusementpark.mvc;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

public class Carousel {
    private String name;
    private double speed;
    public String getName(){
        return name;
    }
    public double getSpeed(){
        return speed;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSpeed(double speed){
        this.speed=speed;
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Carousel",
                        "setSpeed",
                        String.valueOf(System.identityHashCode(this)),
                        "修改旋转木马速度"
                )
        );
    }
    public Carousel(String name,double speed){
        this.name=name;
        this.speed=speed;
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Carousel",
                        "Carousel",
                        String.valueOf(System.identityHashCode(this)),
                        "Carousel构造器"
                )
        );
    }
}

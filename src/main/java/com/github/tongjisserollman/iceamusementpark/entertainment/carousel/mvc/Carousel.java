package com.github.tongjisserollman.iceamusementpark.entertainment.carousel.mvc;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Mrcopytuo
 *
 * 旋转木马model
 */

public class Carousel {
    private String name;
    private double speed;

    /**
     * 设备名getter
     */
    public String getName(){
        return name;
    }

    /**
     * 速度getter
     */
    public double getSpeed(){
        return speed;
    }

    /**
     * 设备名setter
     */
    public void setName(String name){
        this.name=name;
    }

    /**
     * 速度setter
     */
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

    /**
     * Carousel构造器
     */
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

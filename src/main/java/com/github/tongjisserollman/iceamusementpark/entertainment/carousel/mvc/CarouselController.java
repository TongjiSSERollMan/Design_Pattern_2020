package com.github.tongjisserollman.iceamusementpark.entertainment.carousel.mvc;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Mrcopytuo
 *
 * 旋转木马控制器
 */

public class CarouselController {
    private Carousel model;
    private CarouselView view;

    /**
     * CarouselController构造器
     */
    public CarouselController(Carousel model, CarouselView view){
        this.model=model;
        this.view=view;
        CallStackLogger.log(
                new CallStackLogInfo(
                        "CarouselController",
                        "CarouselController",
                        String.valueOf(System.identityHashCode(this)),
                        "CarouselController构造器"
                )
        );
    }

    /**
     * 控制器修改当前旋转木马的名称
     */
    public void setCarouselName(String name){
        model.setName(name);
        CallStackLogger.log(
                new CallStackLogInfo(
                        "CarouselController",
                        "setCarouselName",
                        String.valueOf(System.identityHashCode(this)),
                        "控制器修改了当前旋转木马的名称"
                )
        );
    }

    /**
     * 控制器修改当前旋转木马的速度
     */
    public void setCarouselSpeed(double speed){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "CarouselController",
                        "setCarouselSpeed",
                        String.valueOf(System.identityHashCode(this)),
                        "控制器修改了当前旋转木马的速度"
                )
        );
        model.setSpeed(speed);
    }

    /**
     * 控制器获取当前旋转木马的名称
     */
    public String getCarouselName(){
        return model.getName();
    }

    /**
     * 控制器获取当前旋转木马的速度
     */
    public double getCarouselSpeed(){
        return model.getSpeed();
    }

    /**
     * 控制器发送一次输出命令
     */
    public void updateView(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "CarouselController",
                        "updateView",
                        String.valueOf(System.identityHashCode(this)),
                        "控制器发送一次输出命令"
                )
        );
        view.printCarouselDetails(model.getName(), model.getSpeed());
    }
}

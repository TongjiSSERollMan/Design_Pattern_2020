package com.github.tongjisserollman.iceamusementpark.mvc;

public class CarouselController {
    private Carousel model;
    private CarouselView view;

    public CarouselController(Carousel model, CarouselView view){
        this.model=model;
        this.view=view;
    }

    public void setCarouselName(String name){
        model.setName(name);
        System.out.println("控制器修改了当前旋转木马的名称");
    }
    public void setCarouselSpeed(double speed){
        model.setSpeed(speed);
        System.out.println("控制器修改了当前旋转木马的速度");
    }
    public String getCarouselName(){
        return model.getName();
    }
    public double getCarouselSpeed(){
        return model.getSpeed();
    }
    public void updateView(){
        System.out.println("控制器发送一次输出命令：");
        view.printCarouselDetails(model.getName(), model.getSpeed());
    }
}

package com.github.tongjisserollman.iceamusementpark.mvc;

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
    }
    public Carousel(String name,double speed){
        this.name=name;
        this.speed=speed;
    }
}

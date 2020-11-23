package com.github.tongjisserollman.iceamusementpark.bridge;

public class PlaneShape extends Shape {
    private String str = "飞机";
    public PlaneShape(MakeAPI makeAPI){
        super(makeAPI);
    }
    @Override
    public void make() {
        makeAPI.makeBalloon(str);
    }
}

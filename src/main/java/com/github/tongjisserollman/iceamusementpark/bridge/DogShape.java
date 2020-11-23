package com.github.tongjisserollman.iceamusementpark.bridge;

public class DogShape extends Shape {
    private String str = "小狗";
    public DogShape(MakeAPI makeAPI){
        super(makeAPI);
    }
    @Override
    public void make() {
        makeAPI.makeBalloon(str);
    }
}

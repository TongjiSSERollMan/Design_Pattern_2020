package com.github.tongjisserollman.iceamusementpark.nullobject;

public class RealActor extends AbstractActor {
    public RealActor(String name){
        this.name=name;
    }
    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}

package com.github.tongjisserollman.iceamusementpark.bridge;

public abstract class Shape {
    protected MakeAPI makeAPI;
    protected Shape(MakeAPI makeAPI){
        this.makeAPI=makeAPI;
    }
    public abstract void make();
}

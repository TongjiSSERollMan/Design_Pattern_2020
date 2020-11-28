package com.github.tongjisserollman.iceamusementpark.entertainment.wall.decorator;

/**
 * @author hq
 */
public abstract class FacilityDecorator implements Facility {
    /**
     * 抽象装饰角色
     */
    protected Facility decoratedFacility;

    public FacilityDecorator(Facility decoratedShape){
        this.decoratedFacility = decoratedShape;
    }

    @Override
    public void display(){
        decoratedFacility.display();
    }
}

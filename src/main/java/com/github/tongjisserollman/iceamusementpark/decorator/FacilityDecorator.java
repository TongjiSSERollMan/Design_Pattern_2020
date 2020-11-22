package com.github.tongjisserollman.iceamusementpark.decorator;

/**
 * @author hq
 */
public abstract class FacilityDecorator implements Facility {

    protected Facility decoratedFacility;

    public FacilityDecorator(Facility decoratedShape){
        this.decoratedFacility = decoratedShape;
    }

    @Override
    public void display(){
        decoratedFacility.display();
    }
}

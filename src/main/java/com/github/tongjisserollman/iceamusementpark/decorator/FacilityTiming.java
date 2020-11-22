package com.github.tongjisserollman.iceamusementpark.decorator;

/**
 * @author hq
 */
public class FacilityTiming extends FacilityDecorator{

    public FacilityTiming(Facility decoratedFacility) {
        super(decoratedFacility);
    }

    @Override
    public void display() {
        decoratedFacility.display();
        setFacilityTiming(decoratedFacility);
    }

    private void setFacilityTiming(Facility decoratedShape){
        System.out.println("The facility has a timer function");
    }
}


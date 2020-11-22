package com.github.tongjisserollman.iceamusementpark.decorator;

/**
 * @author hq
 */
public class FacilityWall extends FacilityDecorator{

    public FacilityWall(Facility decoratedFacility) {
        super(decoratedFacility);
    }

    @Override
    public void display() {
        decoratedFacility.display();
        setFacilityWall(decoratedFacility);
    }

    private void setFacilityWall(Facility decoratedShape){
        System.out.println("The facility has a wall");
    }
}
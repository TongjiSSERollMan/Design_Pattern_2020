package com.github.tongjisserollman.iceamusementpark.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryTest {
    @Test
    void MyFactoryTest() {
        MyFactory myFactory = new MyFactory();
        MyFacility testFacility = myFactory.createFacility("摸鱼天堂");
        assertEquals(testFacility.getFacilityName(), "摸鱼天堂");
        assertEquals(testFacility.hasRun, false);
        testFacility.run();
        assertEquals(testFacility.hasRun, true);
    }
}

class MyFactory extends FacilityFactory{
    @Override
    public MyFacility createFacility(String facilityName) {
        MyFacility myFacility = new MyFacility(facilityName);
        return myFacility;
    }
}

class MyFacility extends Facility{
    public boolean hasRun = false;
    MyFacility(String name){
        super(name);
    }
    MyFacility(){
        super();
    }
    @Override
    public void run() {
        hasRun = true;
    }
}

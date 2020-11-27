package com.github.tongjisserollman.iceamusementpark.facade;

import static org.junit.jupiter.api.Assertions.*;

class FacadeTest {
    @org.junit.jupiter.api.Test
    void testFacade(){
        SecuritySystem securitySystem = new SecuritySystem();
        securitySystem.turnOnAllDevices();
        securitySystem.turnOffAllDevices();
    }
}
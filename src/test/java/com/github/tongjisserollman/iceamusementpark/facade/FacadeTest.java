package com.github.tongjisserollman.iceamusementpark.facade;

import com.github.tongjisserollman.iceamusementpark.base.securitysystem.facade.SecuritySystem;

class FacadeTest {
    @org.junit.jupiter.api.Test
    void testFacade(){
        SecuritySystem securitySystem = new SecuritySystem();
        securitySystem.turnOnAllDevices();
        securitySystem.turnOffAllDevices();
    }
}
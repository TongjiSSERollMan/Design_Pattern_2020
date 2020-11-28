package com.github.tongjisserollman.iceamusementpark.facade;

import com.github.tongjisserollman.iceamusementpark.base.securitysystem.facade.SecuritySystem;
import org.junit.jupiter.api.Test;

class FacadeTest {

    @Test
    void testFacade(){
        SecuritySystem securitySystem = new SecuritySystem();
        securitySystem.turnOnAllDevices();
        securitySystem.turnOffAllDevices();
    }
}
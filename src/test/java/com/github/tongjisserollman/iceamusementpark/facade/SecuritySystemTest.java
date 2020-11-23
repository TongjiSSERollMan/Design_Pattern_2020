package com.github.tongjisserollman.iceamusementpark.facade;

import static org.junit.jupiter.api.Assertions.*;

class SecuritySystemTest {
    @org.junit.jupiter.api.Test
    void securitySystemTest(){
        SecuritySystem securitySystem = new SecuritySystem();
        securitySystem.turnOnAllDevices();
        securitySystem.turnOffAllDevices();
    }
}
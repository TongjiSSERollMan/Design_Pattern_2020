package com.github.tongjisserollman.iceamusementpark.subclasssandbox;

import org.junit.jupiter.api.Test;

public class SubclassSandboxTest {

    @Test
    public void subclassSandboxTest(){
        RollMan rollMan = new RollMan();
        UnrollMan unrollMan = new UnrollMan();
        rollMan.activate();
        unrollMan.activate();
    }
}

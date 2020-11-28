package com.github.tongjisserollman.iceamusementpark.subclasssandbox;

import com.github.tongjisserollman.iceamusementpark.facilities.arcadegame.subclasssandbox.RollMan;
import com.github.tongjisserollman.iceamusementpark.facilities.arcadegame.subclasssandbox.UnrollMan;
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

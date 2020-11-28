package com.github.tongjisserollman.iceamusementpark.subclasssandbox;

import com.github.tongjisserollman.iceamusementpark.entertainment.arcadegame.subclasssandbox.RollMan;
import com.github.tongjisserollman.iceamusementpark.entertainment.arcadegame.subclasssandbox.UnrollMan;
import org.junit.jupiter.api.Test;

public class SubclassSandboxTest {

    @Test
    public void testSubclassSandbox(){
        RollMan rollMan = new RollMan();
        UnrollMan unrollMan = new UnrollMan();
        rollMan.activate();
        unrollMan.activate();
    }
}

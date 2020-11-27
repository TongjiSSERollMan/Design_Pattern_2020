package com.github.tongjisserollman.iceamusementpark.composite;

import org.junit.jupiter.api.Test;

public class CompositeTest {

    @Test
    void testComposite() {
        IceSculpture wzjSculpture = new IceSculpture("wzj");
        IceSculpture lxdSculpture = new IceSculpture("lxd");
        IceSculpture jjfSculpture = new IceSculpture("jjf");

        wzjSculpture.addSculptureComponent(jjfSculpture);
        wzjSculpture.addSculptureComponent(lxdSculpture);
        wzjSculpture.removeSculptureComponent(jjfSculpture);
        jjfSculpture.addSculptureComponent(lxdSculpture);
    }
}

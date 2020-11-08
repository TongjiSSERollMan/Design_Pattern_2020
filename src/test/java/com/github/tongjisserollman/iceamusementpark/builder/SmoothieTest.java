package com.github.tongjisserollman.iceamusementpark.builder;

import static org.junit.jupiter.api.Assertions.*;

class SmoothieTest {

    @org.junit.jupiter.api.Test
    void testShow() {
        Smoothie smoothie = new Smoothie(1, "火龙果");
        smoothie.show();
    }
}
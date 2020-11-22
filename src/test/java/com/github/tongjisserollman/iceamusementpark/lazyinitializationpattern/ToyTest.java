package com.github.tongjisserollman.iceamusementpark.lazyinitializationpattern;

import static org.junit.jupiter.api.Assertions.*;

class ToyTest {
    @org.junit.jupiter.api.Test
    void toyTest(){
        assert(Toy.types.get("car") == null);
        Toy toy1 = Toy.getToy("car");
        assert(Toy.types.get("car") != null);
        Toy toy2 = Toy.getToy("car");
        assertSame(toy1, toy2);
        toy1.setPrice(33.3);
        assert(toy1.getPrice()==toy2.getPrice());
    }
}
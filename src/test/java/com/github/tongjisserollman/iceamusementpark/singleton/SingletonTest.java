package com.github.tongjisserollman.iceamusementpark.singleton;


import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {
    @org.junit.jupiter.api.Test
    void parkTest() {
        AmusementPark park1 = AmusementPark.getInstance();
        AmusementPark park2 = AmusementPark.getInstance();
        assertSame(park1, park2);
    }
}

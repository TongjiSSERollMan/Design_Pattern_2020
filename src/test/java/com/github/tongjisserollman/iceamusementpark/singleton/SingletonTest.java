package com.github.tongjisserollman.iceamusementpark.singleton;

import com.github.tongjisserollman.iceamusementpark.base.amusementpark.singleton.AmusementPark;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {

    @Test
    void testSingleton() {
        AmusementPark park1 = AmusementPark.getInstance();
        AmusementPark park2 = AmusementPark.getInstance();
        assertSame(park1, park2);
        System.out.println("游乐园是：" + park1.toString());
    }
}

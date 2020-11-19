package com.github.tongjisserollman.iceamusementpark.singleton;


public class SingletonTest {
    @org.junit.jupiter.api.Test
    void parkTest() {
        AmusementPark park1 = AmusementPark.getInstance();
        AmusementPark park2 = AmusementPark.getInstance();
        if (park1 == park2) {
            System.out.println("单例模式测试通过。");
        } else {
            System.out.println("单例模式测试失败。");
        }
    }
}

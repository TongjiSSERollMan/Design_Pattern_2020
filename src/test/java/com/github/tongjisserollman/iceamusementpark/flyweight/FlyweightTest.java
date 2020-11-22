package com.github.tongjisserollman.iceamusementpark.flyweight;

import org.junit.jupiter.api.Test;
/**
 * @author hq
 */
public class FlyweightTest {

    @Test
    void bgmFactory(){
        BGMFactory factory = new BGMFactory();

        BGM place1 = factory.getBGMName("mine");
        place1.use();
        BGM place2 = factory.getBGMName("mine");
        place2.use();
        BGM place3 = factory.getBGMName("A Little Story");
        place3.use();
        BGM place4 = factory.getBGMName("A Little Story");
        place4.use();
        BGM place5 = factory.getBGMName("A Little Story");
        place5.use();
        BGM place6 = factory.getBGMName("Luv Letter");
        place6.use();

//        System.out.println("The number of background music is:" + factory.getBGMCount());
    }
}

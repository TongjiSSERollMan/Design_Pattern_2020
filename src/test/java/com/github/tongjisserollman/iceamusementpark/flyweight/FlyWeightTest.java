package com.github.tongjisserollman.iceamusementpark.flyweight;

import org.junit.jupiter.api.Test;

/**
 * @author hq
 */
public class FlyWeightTest {

    @Test
    void showTest(){
        BGM bgm1 = (BGM)BGMFactory.getBGM("mine");
        bgm1.setPlace("旋转木马");
        bgm1.show();
    }
}

package com.github.tongjisserollman.iceamusementpark.flyweight;

import org.junit.jupiter.api.Test;

/**
 * @author hq
 */
public class FlyWeightTest {
    @Test
    void showTest(){
        BGM bgm1 = (BGM)BGMFactory.getBGM("Mine");
        bgm1.setPlace("门口");
        bgm1.show();
        BGM bgm2 = (BGM)BGMFactory.getBGM("Red");
        bgm2.setPlace("鬼屋");
        bgm1.show();
        BGM bgm3 = (BGM)BGMFactory.getBGM("Mine");
        bgm3.setPlace("过山车");
        bgm1.show();
        BGM bgm4 = (BGM)BGMFactory.getBGM("Mine");
        bgm4.setPlace("旋转木马");
        bgm1.show();
        BGM bgm5 = (BGM)BGMFactory.getBGM("16");
        bgm5.setPlace("后门");
        bgm1.show();
        BGM bgm6 = (BGM)BGMFactory.getBGM("Red");
        bgm6.setPlace("海盗船");
        bgm1.show();
    }
}

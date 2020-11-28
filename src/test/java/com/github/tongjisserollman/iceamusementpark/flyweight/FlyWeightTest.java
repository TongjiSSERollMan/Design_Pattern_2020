package com.github.tongjisserollman.iceamusementpark.flyweight;

import com.github.tongjisserollman.iceamusementpark.base.bgm.flyweight.BGM;
import com.github.tongjisserollman.iceamusementpark.base.bgm.flyweight.BGMFactory;
import org.junit.jupiter.api.Test;

/**
 * @author hq
 */
public class FlyWeightTest {

    @Test
    void testFlyWeight(){
        BGM bgm1 = (BGM) BGMFactory.getBGM("Mine");
        bgm1.setPlace("门口");
        bgm1.show();
        BGM bgm2 = (BGM)BGMFactory.getBGM("Red");
        bgm2.setPlace("鬼屋");
        bgm2.show();
        BGM bgm3 = (BGM)BGMFactory.getBGM("Mine");
        bgm3.setPlace("过山车");
        bgm3.show();
        BGM bgm4 = (BGM)BGMFactory.getBGM("Mine");
        bgm4.setPlace("旋转木马");
        bgm4.show();
        BGM bgm5 = (BGM)BGMFactory.getBGM("16");
        bgm5.setPlace("后门");
        bgm5.show();
        BGM bgm6 = (BGM)BGMFactory.getBGM("Red");
        bgm6.setPlace("海盗船");
        bgm6.show();
    }
}

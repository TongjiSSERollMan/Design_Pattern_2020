package com.github.tongjisserollman.iceamusementpark.dirtyflag;

import com.github.tongjisserollman.iceamusementpark.base.lounge.dirtyflag.Lounge;
import com.github.tongjisserollman.iceamusementpark.base.lounge.dirtyflag.LoungeManager;
import org.junit.jupiter.api.Test;

class DirtyFlagTest {

    @Test
    void testDirtyFlag(){
        System.out.println("脏标记模式测试：");
        Lounge lounge = new Lounge();
        LoungeManager loungeManager = new LoungeManager(lounge);
        System.out.println("第一天");
        lounge.beVisited(20);
        lounge.beVisited(13.5);
        loungeManager.reportFee();
        System.out.println("第二天");
        System.out.println("休息室里新增了可用的设施");
        lounge.changeFacility(200);
        loungeManager.reportFee();
        System.out.println("第三天");
        lounge.beVisited(11.4);
        loungeManager.reportFee();
        System.out.println("第四天");
        loungeManager.reportFee();
    }
}
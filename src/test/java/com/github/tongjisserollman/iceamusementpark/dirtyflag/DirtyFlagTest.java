package com.github.tongjisserollman.iceamusementpark.dirtyflag;

import static org.junit.jupiter.api.Assertions.*;

class DirtyFlagTest {
    @org.junit.jupiter.api.Test
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
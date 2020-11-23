package com.github.tongjisserollman.iceamusementpark.mediator;

class MediatorTest {
    @org.junit.jupiter.api.Test
    void testMediator(){
        System.out.println("中介者模式测试：");
        Shop shop1 = new Shop("梦幻城堡总店");
        Shop shop2 = new Shop("魔王城三号店");
        System.out.println("商店出现向中介系统提出获取需求");
        shop1.sendLackMessage("两箱水，四箱主题帽子");
        shop2.sendLackMessage("一箱面具");
        System.out.println("各仓库查看中介系统，接受需求并进行送货");
    }
}
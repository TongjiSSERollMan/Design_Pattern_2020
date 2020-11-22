package com.github.tongjisserollman.iceamusementpark.mediator;

class TestMediator {
    @org.junit.jupiter.api.Test
    void mediatorTest(){
        System.out.println("中介者模式测试：");
        Shop shop1 = new Shop("梦幻城堡总店");
        Shop shop2 = new Shop("魔王城三号店");

        shop1.sendLackMessage("两箱水，四箱主题帽子");
        shop2.sendLackMessage("一箱面具");
    }
}
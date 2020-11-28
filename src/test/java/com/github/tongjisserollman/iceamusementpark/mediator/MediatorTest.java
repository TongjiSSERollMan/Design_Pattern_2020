package com.github.tongjisserollman.iceamusementpark.mediator;

import com.github.tongjisserollman.iceamusementpark.commodities.shop.mediator.GoodsMediator;
import com.github.tongjisserollman.iceamusementpark.commodities.shop.mediator.HatShop;
import com.github.tongjisserollman.iceamusementpark.commodities.shop.mediator.IcecreamShop;
import com.github.tongjisserollman.iceamusementpark.commodities.shop.mediator.MaskShop;
import org.junit.jupiter.api.Test;

public class MediatorTest {

    @Test
    void testMediator(){
        System.out.println("中介者模式测试：");
        GoodsMediator goodsMediator = new GoodsMediator();
        HatShop shop1 = new HatShop("魔术礼帽");
        MaskShop shop2 = new MaskShop("魔王假面");
        shop1.setGoodsMediator(goodsMediator);
        shop2.setGoodsMediator(goodsMediator);
        System.out.println("商店向中介系统提出获取需求");
        shop1.sendMessage("一箱面具");
        System.out.println("加入新的商店");
        IcecreamShop shop3 = new IcecreamShop("冰雪小窝");
        IcecreamShop shop4 = new IcecreamShop("冰凌之梦");
        shop3.setGoodsMediator(goodsMediator);
        shop4.setGoodsMediator(goodsMediator);
        shop2.sendMessage("两份香草冰淇淋，馋了");
    }
}

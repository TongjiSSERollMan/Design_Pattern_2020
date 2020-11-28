package com.github.tongjisserollman.iceamusementpark.transferobject;

import com.github.tongjisserollman.iceamusementpark.office.goodsmanager.transferobject.GoodsBusinessObject;
import com.github.tongjisserollman.iceamusementpark.office.goodsmanager.transferobject.GoodsTransferObject;
import org.junit.jupiter.api.Test;

import java.util.Map;

class TransferObjectTest {

    @Test
    void testTransferObject() {
        System.out.println("传输对象模式测试：");
        GoodsBusinessObject goodBusinessObject = new GoodsBusinessObject();
        GoodsTransferObject good1 = new GoodsTransferObject(1, "魔法棒", 1);
        GoodsTransferObject good2 = new GoodsTransferObject(10, "帽子", 2);
        GoodsTransferObject good3 = new GoodsTransferObject(13, "钥匙扣", 3);
        goodBusinessObject.addGood(good1);
        goodBusinessObject.addGood(good2);
        goodBusinessObject.addGood(good3);

        for (Map.Entry<Integer, GoodsTransferObject> entry : goodBusinessObject.getAllGoods().entrySet()) {
            System.out.println("货物名：" + entry.getValue().getName() + " id:" + entry.getKey());
        }

        GoodsTransferObject good = new GoodsTransferObject(13, "外套", 4);
        goodBusinessObject.updateGood(good);

        GoodsTransferObject getGood = goodBusinessObject.getGood(13);
        System.out.println("查看单个货物：");
        System.out.println("货物名：" + getGood.getName() + " id：" + getGood.getId());
    }
}
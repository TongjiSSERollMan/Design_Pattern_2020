package com.github.tongjisserollman.iceamusementpark.command;

import org.junit.jupiter.api.Test;

public class CommandTest {

    @Test
    void snackShopFactoryTest() {
        Stock stock = new Stock("纪念品商店",10);

        StockBuy buyStockOrder = new StockBuy(stock);
        StockSell sellStockOrder = new StockSell(stock);

        Clerk clerk = new Clerk();
        clerk.takeOrder(buyStockOrder);
        clerk.takeOrder(sellStockOrder);

        clerk.placeOrders();
    }
}

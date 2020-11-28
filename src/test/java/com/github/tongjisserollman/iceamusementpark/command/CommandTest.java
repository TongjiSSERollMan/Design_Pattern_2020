package com.github.tongjisserollman.iceamusementpark.command;

import com.github.tongjisserollman.iceamusementpark.commodities.stock.command.Clerk;
import com.github.tongjisserollman.iceamusementpark.commodities.stock.command.Stock;
import com.github.tongjisserollman.iceamusementpark.commodities.stock.command.StockBuy;
import com.github.tongjisserollman.iceamusementpark.commodities.stock.command.StockSell;
import org.junit.jupiter.api.Test;

public class CommandTest {

    @Test
    void testCommand() {
        Stock stock = new Stock("纪念品商店",10);

        StockBuy buyStockOrder = new StockBuy(stock);
        StockSell sellStockOrder = new StockSell(stock);

        Clerk clerk = new Clerk();
        clerk.takeOrder(buyStockOrder);
        clerk.takeOrder(sellStockOrder);

        clerk.placeOrders();
    }
}

package com.github.tongjisserollman.iceamusementpark.command;

/**
 * @author zactWu
 *
 * 出库命令
 */
public class StockSell implements Order {
    private Stock stock;

    public StockSell(Stock stock){
        this.stock = stock;
    }
    /**
     * 执行出库命令
     *
     */
    public void execute() {
        stock.sell();
    }
}


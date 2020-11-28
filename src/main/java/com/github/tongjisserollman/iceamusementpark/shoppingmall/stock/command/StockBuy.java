package com.github.tongjisserollman.iceamusementpark.shoppingmall.stock.command;

/**
 * @author zactWu
 *
 * 进货命令
 */
public class StockBuy implements Order {
    private Stock stock;

    public StockBuy(Stock stock){
        this.stock = stock;
    }
    /**
     * 执行进货命令
     *
     */
    @Override
    public void execute() {
        stock.buy();
    }
}


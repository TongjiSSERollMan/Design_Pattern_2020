package com.github.tongjisserollman.iceamusementpark.command;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zactWu
 *
 * 记账职员
 */
public class Clerk {
    private List<Order> orderList = new ArrayList<Order>();
    /**
     * 接收命令
     * @param order 命令
     */
    public void takeOrder(Order order){
        orderList.add(order);
    }
    /**
     * 执行命令
     *
     */
    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}

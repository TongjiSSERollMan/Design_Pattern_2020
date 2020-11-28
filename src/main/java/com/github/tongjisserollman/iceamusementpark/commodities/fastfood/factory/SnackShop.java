package com.github.tongjisserollman.iceamusementpark.commodities.fastfood.factory;

import java.util.NoSuchElementException;

/**
 * @author zactWu
 *
 * 小吃店
 */
public class SnackShop {
    /**
     * 根据订单制造小吃
     */
    public Snack orderSnack(String snackType){
        return switch (snackType) {
            case "Burger" -> new Burger();
            case "Popcorn" -> new Popcorn();
            case "Sausage" -> new Sausage();
            default -> throw new NoSuchElementException("Ordered Snack doesn't Exist.");
        };
    }
}

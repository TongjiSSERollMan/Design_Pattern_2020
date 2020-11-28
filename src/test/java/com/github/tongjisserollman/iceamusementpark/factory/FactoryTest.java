package com.github.tongjisserollman.iceamusementpark.factory;

import com.github.tongjisserollman.iceamusementpark.commodities.fastfood.factory.Snack;
import com.github.tongjisserollman.iceamusementpark.commodities.fastfood.factory.SnackShop;
import org.junit.jupiter.api.Test;

public class FactoryTest {

    @Test
    void testFactory() {
        SnackShop snackShop = new SnackShop();

        Snack burger = snackShop.orderSnack("Burger");
        burger.make();

        Snack popcorn = snackShop.orderSnack("Popcorn");
        popcorn.make();

        Snack sausage = snackShop.orderSnack("Sausage");
        sausage.make();
    }
}

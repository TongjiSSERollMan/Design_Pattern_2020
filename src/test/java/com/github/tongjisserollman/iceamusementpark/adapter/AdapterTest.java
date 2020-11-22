package com.github.tongjisserollman.iceamusementpark.adapter;

import org.junit.jupiter.api.Test;

public class AdapterTest {

    @Test
    void skatingShoeAdapterTest() {
        Skatable skater1 = new Penguin();
        Skatable skater2 = new SkatingShoeAdapter(new Visitor());

        skater1.skate();
        skater2.skate();
    }
}

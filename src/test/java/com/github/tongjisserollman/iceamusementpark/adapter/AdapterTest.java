package com.github.tongjisserollman.iceamusementpark.adapter;

import com.github.tongjisserollman.iceamusementpark.util.Visitor;
import org.junit.jupiter.api.Test;

public class AdapterTest {

    @Test
    void testApdapter() {
        Skatable skater1 = new Penguin();
        Skatable skater2 = new SkatingShoeAdapter(new Visitor("zz"));

        skater1.skate();
        skater2.skate();
    }
}

package com.github.tongjisserollman.iceamusementpark.prototype;

import com.github.tongjisserollman.iceamusementpark.base.chair.prototype.Chair;
import org.junit.jupiter.api.Test;

public class PrototypeTest {

    @Test
    void testPrototype() {
        var original = new Chair("公用椅");

        var staffChair = original.clone();
        staffChair.setName("职员专用椅");

        var eldersChair = original.clone();
        eldersChair.setName("老年人专用椅");

        var childrenChair = original.clone();
        childrenChair.setName("儿童专用椅");

        original.getName();
        staffChair.getName();
        eldersChair.getName();
        childrenChair.getName();

    }
}

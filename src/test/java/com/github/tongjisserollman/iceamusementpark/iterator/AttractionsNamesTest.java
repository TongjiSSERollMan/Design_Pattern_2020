package com.github.tongjisserollman.iceamusementpark.iterator;

import com.github.tongjisserollman.iceamusementpark.base.guide.iterator.AttractionsNames;
import com.github.tongjisserollman.iceamusementpark.base.guide.iterator.Guide;

class IteratorTest {

    @org.junit.jupiter.api.Test
    public void testIterator() {
        AttractionsNames attractionsNames = new AttractionsNames();
        for (Guide guide = attractionsNames.getGuidance(); guide.hasNext(); ) {
            String placeName = (String) guide.next();
            System.out.println("现在游览的是第" + guide.getIndex() + "个景点，名字是: " + placeName);
        }
    }
}
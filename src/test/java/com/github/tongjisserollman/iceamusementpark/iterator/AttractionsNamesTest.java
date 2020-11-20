package com.github.tongjisserollman.iceamusementpark.iterator;

import static org.junit.jupiter.api.Assertions.*;

class AttractionsNamesTest {
    public static void main(String[] args) {
        AttractionsNames attractionsNames = new AttractionsNames();


        for (Guide guide = attractionsNames.getGuidance(); guide.hasNext(); ) {
            String placeName = (String) guide.next();
            System.out.println("现在游览的是第" + guide.getIndex() + "个景点，名字是: " + placeName);
        }
    }
}
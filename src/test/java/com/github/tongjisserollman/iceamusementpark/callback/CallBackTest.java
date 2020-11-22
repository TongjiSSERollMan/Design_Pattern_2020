package com.github.tongjisserollman.iceamusementpark.callback;

import org.junit.jupiter.api.Test;

public class CallBackTest {

    @Test
    void hostelTest(){
        ResultExporter resultExporter = new ResultExporter();
        TouristThread touristThread = new TouristThread();
        touristThread.run(resultExporter);
    }
}

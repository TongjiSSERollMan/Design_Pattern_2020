package com.github.tongjisserollman.iceamusementpark.callback;

import com.github.tongjisserollman.iceamusementpark.shoppingmall.hotel.callback.ResultExporter;
import com.github.tongjisserollman.iceamusementpark.shoppingmall.hotel.callback.TouristThread;
import org.junit.jupiter.api.Test;

public class CallBackTest {

    @Test
    void testCallback(){
        ResultExporter resultExporter = new ResultExporter();
        TouristThread touristThread = new TouristThread();
        touristThread.run(resultExporter);
    }
}

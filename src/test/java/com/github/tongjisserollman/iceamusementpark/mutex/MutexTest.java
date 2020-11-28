package com.github.tongjisserollman.iceamusementpark.mutex;

import com.github.tongjisserollman.iceamusementpark.facilities.ballgame.mutex.Ball;
import com.github.tongjisserollman.iceamusementpark.facilities.ballgame.mutex.Mutex;
import com.github.tongjisserollman.iceamusementpark.facilities.ballgame.mutex.Visitor;
import org.junit.jupiter.api.Test;

public class MutexTest {

    @Test
    public void testMutex(){
        Mutex mutex = new Mutex();
        Ball ball = new Ball(20, mutex);
        Visitor visitor1 = new Visitor("Jhon", ball);
        Visitor visitor2 = new Visitor("Cortana", ball);
        visitor1.start();
        visitor2.start();
    }
}

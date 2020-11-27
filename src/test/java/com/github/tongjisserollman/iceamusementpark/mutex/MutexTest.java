package com.github.tongjisserollman.iceamusementpark.mutex;

import org.junit.jupiter.api.Test;

public class MutexTest {

    @Test
    public void mutexTest(){
        Mutex mutex = new Mutex();
        Ball ball = new Ball(20, mutex);
        Visitor visitor1 = new Visitor("Jhon", ball);
        Visitor visitor2 = new Visitor("Cortana", ball);
        visitor1.start();
        visitor2.start();
    }
}

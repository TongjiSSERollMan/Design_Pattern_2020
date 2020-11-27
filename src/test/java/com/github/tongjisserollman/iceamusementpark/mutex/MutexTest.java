package com.github.tongjisserollman.iceamusementpark.mutex;

import org.junit.jupiter.api.Test;

public class MutexTest {

    @Test
    public void mutexTest(){
        Mutex mutex = new Mutex();
        WashRoom washRoom = new WashRoom(2, mutex);
        Visitor visitor1 = new Visitor("Jhon", washRoom);
        Visitor visitor2 = new Visitor("Cortana", washRoom);
        visitor1.start();
        visitor2.start();
    }
}

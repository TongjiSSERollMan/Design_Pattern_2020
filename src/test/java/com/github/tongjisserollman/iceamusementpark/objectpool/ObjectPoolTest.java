package com.github.tongjisserollman.iceamusementpark.objectpool;

import com.github.tongjisserollman.iceamusementpark.base.bus.objectpool.BusPool;
import com.github.tongjisserollman.iceamusementpark.base.bus.objectpool.ExportingProcess;
import com.github.tongjisserollman.iceamusementpark.base.bus.objectpool.ExportingTask;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

class ObjectPoolTest {

    private BusPool<ExportingProcess> pool;
    private AtomicLong processNo = new AtomicLong(0);

    public void setUp() {
        pool = new BusPool<ExportingProcess>(4, 10, 5) {
            @Override
            protected ExportingProcess createObject() {
                return new ExportingProcess(processNo.incrementAndGet());
            }
        };
    }

    public void tearDown() {
        pool.shutdown();
    }

    public void testBusPool() {
        ExecutorService excutor = Executors.newFixedThreadPool(8);

        excutor.execute(new ExportingTask(pool, 1));
        excutor.execute(new ExportingTask(pool, 2));
        excutor.execute(new ExportingTask(pool, 3));
        excutor.execute(new ExportingTask(pool, 4));
        excutor.execute(new ExportingTask(pool, 5));
        excutor.execute(new ExportingTask(pool, 6));
        excutor.execute(new ExportingTask(pool, 7));
        excutor.execute(new ExportingTask(pool, 8));

        excutor.shutdown();
        try {
            excutor.awaitTermination(30, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testObjectPool() {
        ObjectPoolTest op = new ObjectPoolTest();
        op.setUp();
        op.tearDown();
        op.testBusPool();
    }

}
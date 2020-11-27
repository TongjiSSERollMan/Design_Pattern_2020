package com.github.tongjisserollman.iceamusementpark.mutex;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author aodethri
 *
 * 互斥锁
 */
public class Mutex implements Lock {

    /**
     * 线程锁的拥有者
     */
    private Object owner;

    @Override
    public synchronized void acquire() throws InterruptedException {
        while(owner != null){
            wait();
        }

        owner = Thread.currentThread();
    }

    @Override
    public synchronized void release() {
        if(Thread.currentThread() == owner){
            owner = null;
            notify();
        }
    }

    public Object getOwner(){
        return owner;
    }
}

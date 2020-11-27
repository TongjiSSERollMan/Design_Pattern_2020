package com.github.tongjisserollman.iceamusementpark.mutex;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author aodethri
 *
 * 互斥锁
 */
public class Mutex implements Lock {

    private Object owner;

    @Override
    public synchronized void acquire() throws InterruptedException {
        while(owner != null){
            wait();
        }

        owner = Thread.currentThread();
    }

    @Override
    public void release() {
        if(Thread.currentThread() == owner){
            owner = null;
            String msg = "洗手间内目前无人";
            CallStackLogger.log(
                    new CallStackLogInfo(
                            "Mutex",
                            "release",
                            String.valueOf(System.identityHashCode(this)),
                            msg
                    )
            );
        }
    }

    public Object getOwner(){
        return owner;
    }
}

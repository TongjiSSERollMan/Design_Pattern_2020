package com.github.tongjisserollman.iceamusementpark.mutex;

/**
 * @author aodethri
 *
 * 洗手间类
 */
public class WashRoom {

    private final Lock lock;

    private int beans;

    public WashRoom(int beans, Lock lock){
        this.lock = lock;
        this.beans = beans;
    }

    public boolean takeBean(){
        boolean success = false;
        try {
            lock.acquire();
            success = beans > 0;
            if(success){
                beans -= 1;
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.release();
        }
        return success;
    }
}

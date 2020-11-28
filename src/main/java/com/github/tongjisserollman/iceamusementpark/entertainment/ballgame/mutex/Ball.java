package com.github.tongjisserollman.iceamusementpark.entertainment.ballgame.mutex;

/**
 * @author aodethri
 *
 * 球的具体类
 */
public class Ball {

    private final Lock lock;

    private int num;

    public Ball(int num, Lock lock){
        this.lock = lock;
        this.num = num;
    }

    public boolean takeBall(){
        boolean success = false;
        try {
            lock.acquire();
            success = num > 0;
            if(success){
                num -= 1;
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            lock.release();
        }
        return success;
    }
}

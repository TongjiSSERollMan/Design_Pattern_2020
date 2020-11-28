package com.github.tongjisserollman.iceamusementpark.entertainment.ballgame.mutex;

/**
 * @author aodethri
 *
 * 线程锁接口
 */
public interface Lock {

    /**
     * 取得锁
     *
     * @throws InterruptedException 线程处于阻塞状态
     */
    void acquire() throws InterruptedException;

    /**
     * 释放锁
     */
    void release();
}

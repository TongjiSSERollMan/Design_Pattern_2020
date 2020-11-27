package com.github.tongjisserollman.iceamusementpark.subclasssandbox;

/**
 * @author aodethri
 *
 * 一个叫做"UnrollMan"的AI角色
 */
public class UnrollMan extends Actor {

    @Override
    protected void activate() {
        move(5.0, 5.0);
        attack();
        cheer("Faster than you, ROLL is forbidden!");
    }
}

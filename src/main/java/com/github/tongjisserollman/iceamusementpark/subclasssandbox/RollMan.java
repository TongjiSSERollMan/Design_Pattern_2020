package com.github.tongjisserollman.iceamusementpark.subclasssandbox;

/**
 * @author aodethri
 *
 * 一个叫做 "RollMan" 的AI角色
 */
public class RollMan extends Actor {

    @Override
    protected void activate() {
        move(5.0, 5.0);
        cheer("My name is RollMan!");
        attack();
    }
}

package com.github.tongjisserollman.iceamusementpark.entertainment.arcadegame.subclasssandbox;

/**
 * @author aodethri
 *
 * 一个叫做 "RollMan" 的AI角色
 */
public class RollMan extends Actor {

    @Override
    public void activate() {
        move(5.0, 5.0);
        cheer("My name is RollMan!");
        attack();
    }
}

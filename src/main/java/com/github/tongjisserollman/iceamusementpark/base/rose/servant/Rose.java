package com.github.tongjisserollman.iceamusementpark.base.rose.servant;

/**
 * @author Major333
 *
 * 玫瑰类，实现movable接口
 */
public class Rose implements Movable{
    private Position p;

    public void setPosition(Position p) { this.p = p; }

    public Position getPosition() {
        return this.p;
    }
}

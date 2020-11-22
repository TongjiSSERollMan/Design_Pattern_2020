package com.github.tongjisserollman.iceamusementpark.servant;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;

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

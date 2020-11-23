package com.github.tongjisserollman.iceamusementpark.servant;

/**
 * @author Major333
 *
 * 花卉等类需要实现的接口
 * 可以移动
 */
public interface Movable {

    /**
     * 更新位置
     */
    public void setPosition(Position p);

    /**
     * 获取位置
     */
    public Position getPosition();
}

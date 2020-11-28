package com.github.tongjisserollman.iceamusementpark.base.rose.servant;

/**
 * @author Major333
 *
 * 位置类，由x位置和y位置两个维度确定
 */
public class Position {
    public int xPosition;
    public int yPosition;

    /**
     * 位置类构造函数
     *
     * @param dx x维度的坐标
     * @param dy y维度的坐标
     */
    public Position(int dx, int dy) {
        xPosition = dx;
        yPosition = dy;
    }
}

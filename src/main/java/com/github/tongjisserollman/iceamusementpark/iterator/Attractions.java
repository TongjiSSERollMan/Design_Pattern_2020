package com.github.tongjisserollman.iceamusementpark.iterator;

/**
 * @author LXD
 *
 * 参观景点
 */
public interface Attractions {
    /**
     *
     * @return 这个游览的导航顺序，知道这个景点游览完下一个该去哪里
     */
    public Guide getGuidance();
}

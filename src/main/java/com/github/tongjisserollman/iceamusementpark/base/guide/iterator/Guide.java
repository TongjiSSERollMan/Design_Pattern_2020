package com.github.tongjisserollman.iceamusementpark.base.guide.iterator;

/**
 * @author LXD
 *
 * 导航，会给一个建议的游览顺序
 */
public interface Guide {

    /**
     * 按照当前推荐游览顺序，这个景点是不是最后一个
     *
     * @return 按照当前推荐游览顺序，这个景点是不是最后一个
     */
    public boolean hasNext();

    /**
     * 按照当前推荐游览顺序，这个景点是不是最后一个
     *
     * @return 按照guide的顺序的下一个景点
     */
    public Object next();


    public int getIndex();
}

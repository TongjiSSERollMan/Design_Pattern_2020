package com.github.tongjisserollman.iceamusementpark.pipeline;

/**
 * @author xuedixuedi
 * <p>
 * 管道的阀门接口
 */
public interface Valve {
    public Valve getNext();

    public void setNext(Valve v);

    public void invoke(String s);
}

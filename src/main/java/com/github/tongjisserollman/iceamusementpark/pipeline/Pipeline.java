package com.github.tongjisserollman.iceamusementpark.pipeline;

/**
 * @author xuedixuedi
 * <p>
 * 管道抽象类
 */
public interface Pipeline {
    public Valve getFirst();

    public Valve getBasic();

    public void setBasic(Valve v);

    public void addValve(Valve v);
}

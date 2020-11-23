package com.github.tongjisserollman.iceamusementpark.state;

/**
 * @author aodethri
 *
 * 旋转茶杯的状态
 */
public interface State {
    /**
     * 显示茶杯的运行状态
     * @param teacup 某个特定的茶杯
     */
    void run(Teacup teacup);
}

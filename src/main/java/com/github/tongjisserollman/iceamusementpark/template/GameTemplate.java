package com.github.tongjisserollman.iceamusementpark.template;
/**
 * @author Moreonenight
 *
 * 游乐项目的基类，继承不同的游乐项目
 */
public abstract class GameTemplate {
    /**
     * 完成游乐项目开始前的准备工作，如检查设施等
     */
    abstract void initialize();
    /**
     * 检票，允许游客进入设施
     */
    abstract void checkIn();
    /**
     * 开始游乐项目
     */
    abstract void startGame();
    /**
     * 结束游乐项目
     */
    abstract void endGame();
    /**
     * 游客散场，进行散场后的清理和检查
     */
    abstract void cleanUp();
    public final void playGame() {
        initialize();
        checkIn();
        startGame();
        endGame();
        cleanUp();
    }
}

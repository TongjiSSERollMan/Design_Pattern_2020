package com.github.tongjisserollman.iceamusementpark.template;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Moreonenight
 *
 * 不同游乐项目的主干，具体游乐项目需要重写run()方法
 */
public abstract class GameTemplate {
    /**
     * 完成游乐项目开始前的准备工作，如检查设施等
     */
    public void initialize(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "GameTemplate",
                        "initialize",
                        String.valueOf(System.identityHashCode(this)),
                        "游乐项目开始前检查设施"
                )
        );
    }
    /**
     * 检票，允许游客进入设施
     */
    public void checkIn(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "GameTemplate",
                        "checkIn",
                        String.valueOf(System.identityHashCode(this)),
                        "检票并允许持票游客进入设施"
                )
        );
    }
    /**
     * 开始游乐项目
     */
    public void startGame(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "GameTemplate",
                        "startGame",
                        String.valueOf(System.identityHashCode(this)),
                        "开始游乐项目"
                )
        );
    }
    /**
     * 进行游乐项目
     */
    public abstract void run();
    /**
     * 结束游乐项目
     */
    public void endGame(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "GameTemplate",
                        "endGame",
                        String.valueOf(System.identityHashCode(this)),
                        "结束游乐项目"
                )
        );
    }
    /**
     * 游客散场，进行散场后的清理和检查
     */
    public void cleanUp(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "GameTemplate",
                        "cleanUp",
                        String.valueOf(System.identityHashCode(this)),
                        "游客散场后的清理工作"
                )
        );
    }
    public final void playGame() {
        initialize();
        checkIn();
        startGame();
        run();
        endGame();
        cleanUp();
    }
}

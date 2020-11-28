package com.github.tongjisserollman.iceamusementpark.entertainment.movie.template;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Moreonenight
 *
 * 不同电影的主干，具体电影需要重写play()方法
 */
public abstract class MovieTemplate {
    /**
     * 完成电影开始前的准备工作，如检查设施等
     */
    public void initialize(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "MovieTemplate",
                        "initialize",
                        String.valueOf(System.identityHashCode(this)),
                        "电影开始前检查设施"
                )
        );
    }
    /**
     * 检票，允许观众进入电影
     */
    public void checkIn(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "MovieTemplate",
                        "checkIn",
                        String.valueOf(System.identityHashCode(this)),
                        "检票并允许持票观众进入影院"
                )
        );
    }
    /**
     * 开始电影
     */
    public void startMovie(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "MovieTemplate",
                        "startMovie",
                        String.valueOf(System.identityHashCode(this)),
                        "开始电影"
                )
        );
    }
    /**
     * 播放电影
     */
    public abstract void play();
    /**
     * 结束
     */
    public void endMovie(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "MovieTemplate",
                        "endMovie",
                        String.valueOf(System.identityHashCode(this)),
                        "结束电影"
                )
        );
    }
    /**
     * 观众散场，进行散场后的清理和检查
     */
    public void cleanUp(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "MovieTemplate",
                        "cleanUp",
                        String.valueOf(System.identityHashCode(this)),
                        "观众散场后的清理工作"
                )
        );
    }
    public final void playMovie() {
        initialize();
        checkIn();
        startMovie();
        play();
        endMovie();
        cleanUp();
    }
}

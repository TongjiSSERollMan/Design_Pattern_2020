package com.github.tongjisserollman.iceamusementpark.flyweight;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author hq
 */
public class BGM {
    private String name;
    private String place;

    public BGM(String name) {
        this.name = name;
    }
    /**
     * @description: 设置播放位置
     */
    public void setPlace(String place){
        this.place = place;
    }
    /**
     * @description: 展示该位置Place的BGM
     */
    public void show(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "BGM",
                        "show",
                        String.valueOf(System.identityHashCode(this)),
                        place + "的BGM为" + name
                )
        );
    }
}

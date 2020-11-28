package com.github.tongjisserollman.iceamusementpark.shows.balloon.bridge;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Mrcopytuo
 *
 * 小狗形状类
 */
public class DogShape extends Shape {
    private String str = "小狗";
    public DogShape(MakeAPI makeAPI){
        super(makeAPI);
        CallStackLogger.log(
                new CallStackLogInfo(
                        "DogShape",
                        "DogShape",
                        String.valueOf(System.identityHashCode(this)),
                        "DogShape构造器"
                )
        );
    }
    @Override
    public void make() {
        makeAPI.makeBalloon(str);
        CallStackLogger.log(
                new CallStackLogInfo(
                        "DogShape",
                        "make",
                        String.valueOf(System.identityHashCode(this)),
                        "做一个小狗形状的气球"
                )
        );
    }
}

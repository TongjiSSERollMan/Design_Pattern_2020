package com.github.tongjisserollman.iceamusementpark.mvc;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

public class CarouselView {
    public void printCarouselDetails(String name, double speed){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "CarouselView",
                        "printCarouselDetails",
                        String.valueOf(System.identityHashCode(this)),
                        "视图输出当前model的信息"
                )
        );
        System.out.println("旋转木马"+name+"正在以每分钟"+speed+"圈的速度旋转！");
    }
}

package com.github.tongjisserollman.iceamusementpark.privateclassdata;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

import java.util.Date;

/**
 * @author aodethri
 */
public class ImmutableData {
    /**
     * 获取游乐园信息
     */
    public void run(){
        ParkData parkData = new ParkData("HappyRollMan", 996.0, new Date(), "Unnamed");

        String msg = "游乐园名称为:" + parkData.getParkName() + ","
                + "园区面积(平方公里)为:" + parkData.getArea() + ","
                + "建园时间为:" + parkData.getCreatedTime() + ","
                + "创始人姓名为:" + parkData.getCreatorName() + ",";

        CallStackLogger.log(
                new CallStackLogInfo(
                        "ImmutableData",
                        "run",
                        String.valueOf(System.identityHashCode(this)),
                        msg
                )
        );
    }
}

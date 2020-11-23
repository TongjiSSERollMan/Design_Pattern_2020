package com.github.tongjisserollman.iceamusementpark.facade;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Major333
 *
 * 游乐场的安保相关的电灯
 */
public class Light
{
    private boolean isOn = false;
    public void turnOff()
    {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Light",
                        "turnOff",
                        String.valueOf(System.identityHashCode(this)),
                        "电灯关闭"
                )
        );
        this.isOn = false;
    }

    public void turnOn()
    {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Light",
                        "turnOn",
                        String.valueOf(System.identityHashCode(this)),
                        "电灯开启"
                )
        );
        this.isOn = true;
    }
}

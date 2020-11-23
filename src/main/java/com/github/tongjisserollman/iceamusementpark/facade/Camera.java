package com.github.tongjisserollman.iceamusementpark.facade;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Major333
 *
 * 游乐场的安保相关摄像头
 */
public class Camera
{
    private boolean isOn = false;
    private int degrees = 0;
    public void turnOn()
    {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Camera",
                        "turnOn",
                        String.valueOf(System.identityHashCode(this)),
                        "摄像头开启"
                )
        );
        this.isOn = true;
    }

    public void turnOff()
    {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Camera",
                        "turnOff",
                        String.valueOf(System.identityHashCode(this)),
                        "摄像头关闭"
                )
        );
        this.isOn = false;
    }

    public void rotate(int degrees)
    {
        this.degrees = degrees;
        System.out.printf("Rotating the camera by %d degrees.", degrees);
    }
}

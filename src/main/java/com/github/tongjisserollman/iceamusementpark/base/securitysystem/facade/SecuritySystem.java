package com.github.tongjisserollman.iceamusementpark.base.securitysystem.facade;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Major333
 *
 * 游乐场的安保系统控制台
 * 每个控制台可以控制两台摄像头，一个警报器, 两个电灯
 */
public class SecuritySystem {
    final private Camera camera1, camera2;
    final private Alarm alarm;
    final private Light light1, light2;

    /**
     * 安保控制台构造函数
     */
    public SecuritySystem(){
        camera1 = new Camera();
        camera2 = new Camera();
        alarm = new Alarm();
        light1 = new Light();
        light2 = new Light();
    }

    /**
     * 安保控制台启动所有安保设备
     */
    public void turnOnAllDevices(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "SecuritySystem",
                        "turnOnAllDevices",
                        String.valueOf(System.identityHashCode(this)),
                        "安保控制台启动所有安保设备"
                )
        );

        camera1.turnOn();
        camera2.turnOn();
        alarm.activate();
        light1.turnOn();
        light2.turnOn();
    }

    /**
     * 安保控制台关闭所有安保设备
     */
    public void turnOffAllDevices(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "SecuritySystem",
                        "turnOffAllDevices",
                        String.valueOf(System.identityHashCode(this)),
                        "安保控制台关闭所有安保设备"
                )
        );

        camera1.turnOff();
        camera2.turnOff();
        alarm.deactivate();
        light1.turnOff();
        light2.turnOff();
    }

}

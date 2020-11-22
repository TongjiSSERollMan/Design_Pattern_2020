package com.github.tongjisserollman.iceamusementpark.facade;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Major333
 *
 * 游乐场的安保相关的警报设备
 */
public class Alarm
{
    private boolean isActivity = false;
    public void activate()
    {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Alarm",
                        "activate",
                        String.valueOf(System.identityHashCode(this)),
                        "警报器开启"
                )
        );
        this.isActivity=true;
    }

    public void deactivate()
    {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Alarm",
                        "deactivate",
                        String.valueOf(System.identityHashCode(this)),
                        "警报器关闭"
                )
        );
        this.isActivity=false;
    }

    public void ring()
    {
        if(this.isActivity){
            System.out.println("Ringing the alarm.");
        }
        else{
            System.out.println("Ringing is not activity");
        }
    }

    public void stopRing()
    {
        System.out.println("Stop the alarm.");
    }
}
package com.github.tongjisserollman.iceamusementpark.util;

public class CallStackLogInfo
{
    public String className;
    public String methodName;
    public String objectId;
    public String description;

    public CallStackLogInfo(){}
    
    public CallStackLogInfo(String className, String methodName, String objectId, String description)
    {
        this.className = className;
        this.methodName = methodName;
        this.objectId = objectId;
        this.description = description;
    }
}
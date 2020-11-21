package com.github.tongjisserollman.iceamusementpark.prototype;

import com.sun.jdi.InternalException;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author zactWu
 *
 * 椅子
 */
public class Chair implements Cloneable{
    private String name;
    public Chair(String name){this.name = name;}
    /**
     *设置椅子名
     *
     * @param name 椅子的名字
     */
    public void setName(String name){this.name = name;}
    /**
     *获得椅子名
     */
    public void getName(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Chair",
                        "getName",
                        String.valueOf(System.identityHashCode(this)),
                        "这把椅子是"+this.name
                )
        );
    }
    /**
     *复制一把椅子
     * @return Chair 椅子
     */
    @Override
    public Chair clone(){
        try{
            return (Chair)super.clone();
        }catch (CloneNotSupportedException e) {
            throw new InternalError();
        }
    }
}

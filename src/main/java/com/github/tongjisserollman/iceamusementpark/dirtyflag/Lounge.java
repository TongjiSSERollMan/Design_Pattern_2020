package com.github.tongjisserollman.iceamusementpark.dirtyflag;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Mrcopytuo
 *
 * 休息间类
 */

public class Lounge {
    private boolean visited;
    private double baseFee;
    private double extraCost;

    /**
     * Lounge构造器
     */
    public Lounge(){
        visited=false;
        baseFee=100;
        extraCost=0;
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Lounge",
                        "Lounge",
                        String.valueOf(System.identityHashCode(this)),
                        "Lounge构造器"
                )
        );
    }

    public void changeFacility(double extra){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Lounge",
                        "beVisited",
                        String.valueOf(System.identityHashCode(this)),
                        "休息间设施发生了改变，带来基础维护费用升高"+extra
                )
        );
        visited=true;
        baseFee+=extra;
    }

    /**
     * 休息间被使用，带来维护费用升高
     */
    public void beVisited(double extra){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Lounge",
                        "beVisited",
                        String.valueOf(System.identityHashCode(this)),
                        "休息间被使用，带来当日维护费用升高"+extra
                )
        );
        visited=true;
        extraCost+=extra;
    }

    /**
     * 查看是否被使用
     */
    public boolean getVisited(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Lounge",
                        "getVisited",
                        String.valueOf(System.identityHashCode(this)),
                        "查看是否被使用"
                )
        );
        return visited;
    }

    /**
     * 检查并计算休息间维护费用
     */
    public double calculateFee(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Lounge",
                        "calculateFee",
                        String.valueOf(System.identityHashCode(this)),
                        "检查并计算休息间维护费用"
                )
        );
        if(getVisited()){
            System.out.println("休息间被使用或者增删了设施，这会花一段时间进行清理和统计计算费用......");
            visited=false;
            double res = baseFee+extraCost;
            extraCost=0;
            return res;
        }
        else {
            System.out.println("休息间没有被使用或者增删设施，直接获得基础维护费用");
            return baseFee;
        }
    }
}

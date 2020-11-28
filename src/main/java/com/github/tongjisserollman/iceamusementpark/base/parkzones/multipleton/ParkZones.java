package com.github.tongjisserollman.iceamusementpark.base.parkzones.multipleton;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

import java.util.NoSuchElementException;

/**
 * @author Moreonenight
 *
 * 游乐场的分区（舞台区、游乐区、商业区、办公区）
 */
public enum ParkZones {
    // 用枚举类型实现多例模式（单例的集合）
    STAGE_ZONE, AMUSEMENT_ZONE, BUSINESS_ZONE, ADMIN_ZONE;
    /**
     * 获取冰雪游乐场特定分区的单例
     * @param zoneName 需要获取的分区的名称，可以是"stageZone", "amusementZone", "businessZone" 或 "adminZone"
     * @return 获取到的分区的单例
     */
    public static ParkZones getInstance(String zoneName){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "ParkZones",
                        "getInstance",
                        "ParkZones.ENUMs",
                        "获取冰雪游乐场特定分区的单例"
                )
        );
        return switch (zoneName) {
            case "stageZone" -> STAGE_ZONE;
            case "amusementZone" -> AMUSEMENT_ZONE;
            case "businessZone" -> BUSINESS_ZONE;
            case "adminZone" -> ADMIN_ZONE;
            default -> throw new NoSuchElementException("Requested Zone doesn't Exist.");
        };
    }
}

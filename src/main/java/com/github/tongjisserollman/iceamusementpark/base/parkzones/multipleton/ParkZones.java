package com.github.tongjisserollman.iceamusementpark.base.parkzones.multipleton;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

import java.util.NoSuchElementException;

/**
 * @author Moreonenight
 *
 * 游乐场的分区（游乐区, 舞台区, 商业区, 办公区)
 */
public enum ParkZones {
    // 用枚举类型实现多例模式（单例的集合）
    ENTERTAINMENT_ZONE, STAGE_ZONE, SHOPPING_MALL_ZONE, OFFICE_ZONE;
    /**
     * 获取冰雪游乐场特定分区的单例
     * @param zoneName 需要获取的分区的名称，可以是"entertainmentZone", "stageZone", "shoppingMallZone" 或 "officeZone"
     * @return 获取到的分区的单例
     */
    public static ParkZones getInstance(String zoneName){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "ParkZones",
                        "getInstance",
                        String.valueOf(System.identityHashCode(ParkZones.class)),
                        "获取冰雪游乐场特定分区的单例"
                )
        );
        return switch (zoneName) {
            case "entertainmentZone" -> ENTERTAINMENT_ZONE;
            case "stageZone" -> STAGE_ZONE;
            case "shoppingMallZone" -> SHOPPING_MALL_ZONE;
            case "officeZone" -> OFFICE_ZONE;
            default -> throw new NoSuchElementException("Requested Zone doesn't Exist.");
        };
    }
}

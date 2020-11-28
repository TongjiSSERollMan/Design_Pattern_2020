package com.github.tongjisserollman.iceamusementpark.base.parkzones.multipleton;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

import java.util.NoSuchElementException;

/**
 * @author Moreonenight
 *
 * 游乐场的分区（影视区、游乐区、餐馆区、旅馆区）
 */
public enum ParkZones {
    // 用枚举类型实现多例模式（单例的集合）
    MOVIE_ZONE, AMUSEMENT_ZONE, RESTAURANT_ZONE, HOTEL_ZONE;
    /**
     * 获取冰雪游乐场特定分区的单例
     * @param zoneName 需要获取的分区的名称，可以是"movieZone", "amusementZone", "restaurantZone" 或 "hotelZone"
     * @return 获取到的分区的单例
     */
    public static ParkZones getInstance(String zoneName){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "ParkZones",
                        "getInstance",
                        String.valueOf(System.identityHashCode(MOVIE_ZONE)),
                        "获取冰雪游乐场特定分区的单例"
                )
        );
        return switch (zoneName) {
            case "movieZone" -> MOVIE_ZONE;
            case "amusementZone" -> AMUSEMENT_ZONE;
            case "restaurantZone" -> RESTAURANT_ZONE;
            case "hotelZone" -> HOTEL_ZONE;
            default -> throw new NoSuchElementException("Requested Zone doesn't Exist.");
        };
    }
}

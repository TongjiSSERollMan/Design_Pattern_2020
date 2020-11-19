package com.github.tongjisserollman.iceamusementpark.multipleton;

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
     * create facilities
     * @param zoneName Name of the Zone to Fetch, Can be "movieZone", "amusementZone", "restaurantZone" or "hotelZone"
     * @return Fetched Zone
     */
    public static ParkZones getInstance(String zoneName){
        return switch (zoneName) {
            case "movieZone" -> MOVIE_ZONE;
            case "amusementZone" -> AMUSEMENT_ZONE;
            case "restaurantZone" -> RESTAURANT_ZONE;
            case "hotelZone" -> HOTEL_ZONE;
            default -> throw new NoSuchElementException("Requested Zone doesn't Exist.");
        };
    }
}

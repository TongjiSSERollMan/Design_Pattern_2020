package com.github.tongjisserollman.iceamusementpark.multipleton;


public class MultipletonTest {
    @org.junit.jupiter.api.Test
    void zonesTest() {
        String[] zonesName = {"movieZone", "amusementZone", "restaurantZone", "hotelZone"};
        boolean flag = true;
        for (int i = 0; i < zonesName.length; i++){
            ParkZones zone1 = ParkZones.getInstance(zonesName[i]);
            ParkZones zone2 = ParkZones.getInstance(zonesName[i]);
            if (zone1 != zone2) {
                    flag = false;
            }
            for (int j = i+1; j < zonesName.length; j++){
                ParkZones zone3 = ParkZones.getInstance(zonesName[i]);
                ParkZones zone4 = ParkZones.getInstance(zonesName[j]);
                if (zone3 == zone4){
                    flag = false;
                }
            }
        }
        if (flag) {
            System.out.println("多例模式测试通过。");
        } else {
            System.out.println("多例模式测试失败。");
        }
    }
}

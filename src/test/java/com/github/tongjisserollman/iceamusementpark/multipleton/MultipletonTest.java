package com.github.tongjisserollman.iceamusementpark.multipleton;


import static org.junit.jupiter.api.Assertions.*;

public class MultipletonTest {
    @org.junit.jupiter.api.Test
    void zonesTest() {
        String[] zonesName = {"movieZone", "amusementZone", "restaurantZone", "hotelZone"};
        for (int i = 0; i < zonesName.length; i++){
            ParkZones zone1 = ParkZones.getInstance(zonesName[i]);
            ParkZones zone2 = ParkZones.getInstance(zonesName[i]);
            assertSame(zone1, zone2);
            for (int j = i+1; j < zonesName.length; j++){
                ParkZones zone3 = ParkZones.getInstance(zonesName[i]);
                ParkZones zone4 = ParkZones.getInstance(zonesName[j]);
                assertNotSame(zone3, zone4);
            }
        }
    }
}

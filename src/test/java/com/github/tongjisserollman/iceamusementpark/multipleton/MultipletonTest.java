package com.github.tongjisserollman.iceamusementpark.multipleton;

import com.github.tongjisserollman.iceamusementpark.base.parkzones.multipleton.ParkZones;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultipletonTest {

    @Test
    void testMultipleton() {
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
        String out1 = ParkZones.getInstance("movieZone").toString();
        String out2 = ParkZones.getInstance("amusementZone").toString();
        String out3 = ParkZones.getInstance("restaurantZone").toString();
        String out4 = ParkZones.getInstance("hotelZone").toString();
        System.out.println("游乐园的分区包括：" + out1 + " " + out2 + " " + out3 + " " + out4);
    }
}

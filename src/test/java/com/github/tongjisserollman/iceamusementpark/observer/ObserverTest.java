package com.github.tongjisserollman.iceamusementpark.observer;

import com.github.tongjisserollman.iceamusementpark.admin.monitor.observer.Office;
import com.github.tongjisserollman.iceamusementpark.admin.monitor.observer.ParkScreen;
import com.github.tongjisserollman.iceamusementpark.admin.monitor.observer.Turnstile;
import com.github.tongjisserollman.iceamusementpark.admin.monitor.observer.VisitorsSystem;
import org.junit.jupiter.api.Test;


public class ObserverTest {

    @Test
    void testObserver() {
        Turnstile turnstile1 = new Turnstile();
        Turnstile turnstile2 = new Turnstile();

        Office office = new Office();
        ParkScreen parkScreen = new ParkScreen();

        VisitorsSystem.getInstance().attach(office);

        turnstile1.visitorEnter();

        VisitorsSystem.getInstance().attach(parkScreen);

        turnstile2.visitorEnter();
        turnstile1.visitorLeave();

        VisitorsSystem.getInstance().detach(office);

        turnstile2.visitorLeave();
    }
}

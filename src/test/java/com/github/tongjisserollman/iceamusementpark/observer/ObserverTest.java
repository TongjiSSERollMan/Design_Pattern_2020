package com.github.tongjisserollman.iceamusementpark.observer;

import org.junit.jupiter.api.Test;


public class ObserverTest {
    @Test
    void observersTest() {
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

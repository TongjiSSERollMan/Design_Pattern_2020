package com.github.tongjisserollman.iceamusementpark.businessdelegate;

import org.junit.jupiter.api.Test;

public class BusinessDelegateTest {

    @Test
    void testBusinessDelegate(){
        DirectorsDelegate directorsDelegate = new DirectorsDelegate();
        directorsDelegate.setServiceType("Plan");

        Client client = new Client(directorsDelegate);
        client.run();

        directorsDelegate.setServiceType("Decision");
        client.run();
    }
}

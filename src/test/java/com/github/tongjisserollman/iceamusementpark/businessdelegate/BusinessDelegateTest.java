package com.github.tongjisserollman.iceamusementpark.businessdelegate;

import com.github.tongjisserollman.iceamusementpark.office.directors.businessdelegate.Client;
import com.github.tongjisserollman.iceamusementpark.office.directors.businessdelegate.DirectorsDelegate;
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

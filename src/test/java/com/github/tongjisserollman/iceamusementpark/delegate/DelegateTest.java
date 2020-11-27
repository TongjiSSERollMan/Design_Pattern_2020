package com.github.tongjisserollman.iceamusementpark.delegate;

import org.junit.jupiter.api.Test;

public class DelegateTest {

    @Test
    void testDelegate(){
        ShowDelegate showDelegate = new ShowDelegate();
        showDelegate.startShow();
    }
}

package com.github.tongjisserollman.iceamusementpark.delegate;

import org.junit.jupiter.api.Test;

public class DelegateTest {

    @Test
    void ShowTest(){
        ShowDelegate showDelegate = new ShowDelegate();
        showDelegate.startShow();
    }
}

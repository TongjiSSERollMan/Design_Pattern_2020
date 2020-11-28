package com.github.tongjisserollman.iceamusementpark.delegate;

import com.github.tongjisserollman.iceamusementpark.shows.animalshow.delegate.ShowDelegate;
import org.junit.jupiter.api.Test;

public class DelegateTest {

    @Test
    void testDelegate(){
        ShowDelegate showDelegate = new ShowDelegate();
        showDelegate.startShow();
    }
}

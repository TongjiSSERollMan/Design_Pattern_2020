package com.github.tongjisserollman.iceamusementpark.state;

import org.junit.jupiter.api.Test;

public class StateTest {

    @Test
    void teacupTest(){
       Teacup teacup = new Teacup();

       StopState stopState = new StopState();
       stopState.run(teacup);

       ClockwiseState clockwiseState = new ClockwiseState();
       clockwiseState.run(teacup);

       CounterclockwiseState counterclockwiseState = new CounterclockwiseState();
       clockwiseState.run(teacup);
    }
}

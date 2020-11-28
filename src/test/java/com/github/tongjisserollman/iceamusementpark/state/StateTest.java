package com.github.tongjisserollman.iceamusementpark.state;

import com.github.tongjisserollman.iceamusementpark.facilities.teacup.state.ClockwiseState;
import com.github.tongjisserollman.iceamusementpark.facilities.teacup.state.CounterclockwiseState;
import com.github.tongjisserollman.iceamusementpark.facilities.teacup.state.StopState;
import com.github.tongjisserollman.iceamusementpark.facilities.teacup.state.Teacup;
import org.junit.jupiter.api.Test;

public class StateTest {

    @Test
    void testState(){
       Teacup teacup = new Teacup();

       StopState stopState = new StopState();
       stopState.run(teacup);

       ClockwiseState clockwiseState = new ClockwiseState();
       clockwiseState.run(teacup);

       CounterclockwiseState counterclockwiseState = new CounterclockwiseState();
       clockwiseState.run(teacup);
    }
}

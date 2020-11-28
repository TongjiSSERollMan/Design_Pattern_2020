package com.github.tongjisserollman.iceamusementpark.blackboard;

import com.github.tongjisserollman.iceamusementpark.base.noticeboard.blackboard.Blackboard;
import com.github.tongjisserollman.iceamusementpark.base.noticeboard.blackboard.Control;
import org.junit.jupiter.api.Test;

/**
 * @author aodethri
 */
public class BlackboardTest {

    @Test
    public void testBlackboard(){
        Blackboard blackboard = new Blackboard();
        Control control = new Control(blackboard);
        control.addSource("今日门票优惠:八折");
        control.addSource("今日旋转茶杯养护，暂不开放");
        control.loop();
        blackboard.inspect();
    }
}

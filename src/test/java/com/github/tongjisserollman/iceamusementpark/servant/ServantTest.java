package com.github.tongjisserollman.iceamusementpark.servant;

import com.github.tongjisserollman.iceamusementpark.base.rose.servant.MoveServant;
import com.github.tongjisserollman.iceamusementpark.base.rose.servant.Position;
import com.github.tongjisserollman.iceamusementpark.base.rose.servant.Rose;
import org.junit.jupiter.api.Test;

class ServantTest {

    @Test
    void testServant() {
        Position p = new Position(3, 5);
        Rose rose = new Rose();
        rose.setPosition(p);

        MoveServant servant = new MoveServant();

        Position newPos = new Position(16, 16);
        servant.moveTo(rose, newPos);
        assert (rose.getPosition() == newPos);

    }

}
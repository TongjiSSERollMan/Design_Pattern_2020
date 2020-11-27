package com.github.tongjisserollman.iceamusementpark.servant;

import java.sql.PseudoColumnUsage;

import static org.junit.jupiter.api.Assertions.*;

class ServantTest {
    @org.junit.jupiter.api.Test
    void testServant(){
        Position p = new Position(3, 5);
        Rose rose = new Rose();
        rose.setPosition(p);

        MoveServant servant = new MoveServant();

        Position newPos = new Position(16,16);
        servant.moveTo(rose ,newPos);
        assert (rose.getPosition()==newPos);

    }

}
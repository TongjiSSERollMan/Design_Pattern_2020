package com.github.tongjisserollman.iceamusementpark.template;


import static org.junit.jupiter.api.Assertions.*;

public class TemplateTest extends GameTemplate{
    StringBuffer testBuffer = new StringBuffer("");
    @Override
    void initialize() {
        testBuffer.append("This ");;
        }
    @Override
    void checkIn() {
        testBuffer.append("test ");
    }
    @Override
    void startGame() {
        testBuffer.append("is ");
    }
    @Override
    void endGame() {
        testBuffer.append("successful");
    }
    @Override
    void cleanUp() {
        testBuffer.append("!");
    }
    @org.junit.jupiter.api.Test
    void gameTest() {
        playGame();
        assertEquals(testBuffer.toString(), "This test is successful!");
    }
}

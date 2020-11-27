package com.github.tongjisserollman.iceamusementpark.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemplateTest{
    @Test
    void testTemplate() {
        MyGame myGame = new MyGame();
        myGame.playGame();
        assertEquals(myGame.getTestBuffer().toString(), "This test is very successful!");
    }
}

class MyGame extends GameTemplate{
    StringBuffer testBuffer = new StringBuffer();
    @Override
    public void initialize() {
        testBuffer.append("This ");
    }
    @Override
    public void checkIn() {
        testBuffer.append("test ");
    }
    @Override
    public void startGame() {
        testBuffer.append("is ");
    }
    @Override
    public void run() {
        testBuffer.append("very ");
    }
    @Override
    public void endGame() {
        testBuffer.append("successful");
    }
    @Override
    public void cleanUp() {
        testBuffer.append("!");
    }
    public StringBuffer getTestBuffer() {
        return testBuffer;
    }
}

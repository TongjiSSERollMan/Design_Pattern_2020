package com.github.tongjisserollman.iceamusementpark.template;


import static org.junit.jupiter.api.Assertions.*;

public class TemplateTest extends FacilityTemplate{
    StringBuffer testBuffer = new StringBuffer("");
    @Override
    public void initialize() {
        testBuffer.append("This ");;
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
    @org.junit.jupiter.api.Test
    public void facilityTest() {
        runFacility();
        System.out.println(testBuffer.toString());
        assertEquals(testBuffer.toString(), "This test is very successful!");
    }
}

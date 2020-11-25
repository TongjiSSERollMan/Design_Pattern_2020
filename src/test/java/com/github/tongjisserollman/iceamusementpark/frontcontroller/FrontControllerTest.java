package com.github.tongjisserollman.iceamusementpark.frontcontroller;

import static org.junit.jupiter.api.Assertions.*;

class FrontControllerTest {
    @org.junit.jupiter.api.Test
    void testFrontController(){
        System.out.println("前端控制器模式测试：");
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("TICKET");
        frontController.dispatchRequest("PHOTO");
    }
}
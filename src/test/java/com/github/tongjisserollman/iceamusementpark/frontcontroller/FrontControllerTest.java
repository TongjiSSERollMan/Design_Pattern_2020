package com.github.tongjisserollman.iceamusementpark.frontcontroller;

import com.github.tongjisserollman.iceamusementpark.base.website.frontcontroller.FrontController;
import org.junit.jupiter.api.Test;

class FrontControllerTest {

    @Test
    void testFrontController(){
        System.out.println("前端控制器模式测试：");
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("TICKET");
        frontController.dispatchRequest("PHOTO");
    }
}
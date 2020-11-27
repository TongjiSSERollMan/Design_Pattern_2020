package com.github.tongjisserollman.iceamusementpark.proxy;

import static org.junit.jupiter.api.Assertions.*;

class ProxyTest {

    @org.junit.jupiter.api.Test
    public void testProxy(){
        Principal secretaryPrinciple = new SecretaryPrinciple("请秘书召集所有员工开会。");
        Principal realPrinciple = new RealPrincipal("召集所有员工开会");
        //执行任务
        realPrinciple.performTask();
        System.out.println("请秘书");

        secretaryPrinciple.performTask();
    }

}
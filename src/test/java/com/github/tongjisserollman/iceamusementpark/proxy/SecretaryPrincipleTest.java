package com.github.tongjisserollman.iceamusementpark.proxy;

import static org.junit.jupiter.api.Assertions.*;

class SecretaryPrincipleTest {

    public static void main(String[] args){
        Principal task = new SecretaryPrinciple("召集所有员工开会。");

        //执行任务
        task.performTask();
        System.out.println("\n");

        task.performTask();
    }

}
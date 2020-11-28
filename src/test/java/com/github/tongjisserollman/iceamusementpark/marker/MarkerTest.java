package com.github.tongjisserollman.iceamusementpark.marker;

import com.github.tongjisserollman.iceamusementpark.office.employeechannel.marker.Officer;
import com.github.tongjisserollman.iceamusementpark.office.employeechannel.marker.Premission;
import com.github.tongjisserollman.iceamusementpark.office.employeechannel.marker.Worker;
import com.github.tongjisserollman.iceamusementpark.util.Visitor;
import org.junit.jupiter.api.Test;

class MarkerTest {

    @Test
    void testMarker(){
        System.out.println("标记者模式测试：");
        Visitor visitor = new Visitor("jjf");
        Worker worker = new Worker("喜羊羊",1);
        Officer officer = new Officer("包包大人");
        System.out.println("员工尝试进入员工通道：");
        if(worker instanceof Premission){
            worker.enterAccess();
        }
        else {
            System.out.println("你没有权限进入员工通道");
        }
        System.out.println();
        System.out.println("领导尝试进入员工通道：");
        if(officer instanceof Premission){
            officer.enterAccess();
        }
        else {
            System.out.println("你没有权限进入员工通道");
        }
        System.out.println();
        System.out.println("游客尝试进入员工通道");
        if(visitor instanceof Premission){
            visitor.enterAccess();
        }
        else {
            System.out.println("你没有权限进入员工通道");
        }

    }
}
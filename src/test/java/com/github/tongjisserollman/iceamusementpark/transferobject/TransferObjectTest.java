package com.github.tongjisserollman.iceamusementpark.transferobject;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TransferObjectTest {
    @org.junit.jupiter.api.Test
    void testTransferObject(){
        System.out.println("传输对象模式测试：");
        WorkerBusinessObject workerBusinessObject = new WorkerBusinessObject();
        workerBusinessObject.addWorker("琉星",1);
        workerBusinessObject.addWorker("十月",10);
        workerBusinessObject.addWorker("贪狼",13);

        for (Map.Entry<Integer,WorkerTransferObject> entry : workerBusinessObject.getAllWorkers().entrySet()){
            System.out.println("姓名："+entry.getValue().getName()+" id:"+entry.getKey());
        }

        WorkerTransferObject worker = new WorkerTransferObject("潇洒哥",13);
        workerBusinessObject.updateWorker(worker);

        WorkerTransferObject getWorker = workerBusinessObject.getWorker(13);
        System.out.println("查看单个员工：");
        System.out.println("姓名："+getWorker.getName()+" id："+getWorker.getId());
    }
}
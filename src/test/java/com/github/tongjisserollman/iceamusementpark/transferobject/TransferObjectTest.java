package com.github.tongjisserollman.iceamusementpark.transferobject;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TransferObjectTest {
    @org.junit.jupiter.api.Test
    void testTransferObject(){
        System.out.println("传输对象模式测试：");
        WorkerBusinessObject workerBusinessObject = new WorkerBusinessObject();
        WorkerTransferObject worker1 = new WorkerTransferObject(1,"琉星","商店店员");
        WorkerTransferObject worker2 = new WorkerTransferObject(10,"十月","玩偶演员");
        WorkerTransferObject worker3 = new WorkerTransferObject(13,"贪狼","商店店长");
        workerBusinessObject.addWorker(worker1);
        workerBusinessObject.addWorker(worker2);
        workerBusinessObject.addWorker(worker3);

        for (Map.Entry<Integer,WorkerTransferObject> entry : workerBusinessObject.getAllWorkers().entrySet()){
            System.out.println("姓名："+entry.getValue().getName()+" id:"+entry.getKey());
        }

        WorkerTransferObject worker = new WorkerTransferObject(13,"潇洒哥", "清洁工");
        workerBusinessObject.updateWorker(worker);

        WorkerTransferObject getWorker = workerBusinessObject.getWorker(13);
        System.out.println("查看单个员工：");
        System.out.println("姓名："+getWorker.getName()+" id："+getWorker.getId());
    }
}
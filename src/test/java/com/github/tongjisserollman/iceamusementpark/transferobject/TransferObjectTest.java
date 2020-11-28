package com.github.tongjisserollman.iceamusementpark.transferobject;

import com.github.tongjisserollman.iceamusementpark.admin.facilitymanager.transferobject.FacilityBusinessObject;
import com.github.tongjisserollman.iceamusementpark.admin.facilitymanager.transferobject.FacilityTransferObject;

import java.util.Map;

class TransferObjectTest {
    @org.junit.jupiter.api.Test
    void testTransferObject(){
        System.out.println("传输对象模式测试：");
        FacilityBusinessObject workerBusinessObject = new FacilityBusinessObject();
        FacilityTransferObject worker1 = new FacilityTransferObject(1,"琉星","商店店员");
        FacilityTransferObject worker2 = new FacilityTransferObject(10,"十月","玩偶演员");
        FacilityTransferObject worker3 = new FacilityTransferObject(13,"贪狼","商店店长");
        workerBusinessObject.addWorker(worker1);
        workerBusinessObject.addWorker(worker2);
        workerBusinessObject.addWorker(worker3);

        for (Map.Entry<Integer, FacilityTransferObject> entry : workerBusinessObject.getAllWorkers().entrySet()){
            System.out.println("姓名："+entry.getValue().getName()+" id:"+entry.getKey());
        }

        FacilityTransferObject worker = new FacilityTransferObject(13,"潇洒哥", "清洁工");
        workerBusinessObject.updateWorker(worker);

        FacilityTransferObject getWorker = workerBusinessObject.getWorker(13);
        System.out.println("查看单个员工：");
        System.out.println("姓名："+getWorker.getName()+" id："+getWorker.getId());
    }
}
package com.github.tongjisserollman.iceamusementpark.transferobject;

import com.github.tongjisserollman.iceamusementpark.admin.facilitymanager.transferobject.FacilityBusinessObject;
import com.github.tongjisserollman.iceamusementpark.admin.facilitymanager.transferobject.FacilityTransferObject;

import java.util.Map;

class TransferObjectTest {
    @org.junit.jupiter.api.Test
    void testTransferObject(){
        System.out.println("传输对象模式测试：");
        FacilityBusinessObject facilityBusinessObject = new FacilityBusinessObject();
        FacilityTransferObject facility1 = new FacilityTransferObject(1,"琉星","商店店员");
        FacilityTransferObject facility2 = new FacilityTransferObject(10,"十月","玩偶演员");
        FacilityTransferObject facility3 = new FacilityTransferObject(13,"贪狼","商店店长");
        facilityBusinessObject.addFacility(facility1);
        facilityBusinessObject.addFacility(facility2);
        facilityBusinessObject.addFacility(facility3);

        for (Map.Entry<Integer, FacilityTransferObject> entry : facilityBusinessObject.getAllFacilitys().entrySet()){
            System.out.println("姓名："+entry.getValue().getName()+" id:"+entry.getKey());
        }

        FacilityTransferObject facility = new FacilityTransferObject(13,"潇洒哥", "清洁工");
        facilityBusinessObject.updateFacility(facility);

        FacilityTransferObject getFacility = facilityBusinessObject.getFacility(13);
        System.out.println("查看单个员工：");
        System.out.println("姓名："+getFacility.getName()+" id："+getFacility.getId());
    }
}
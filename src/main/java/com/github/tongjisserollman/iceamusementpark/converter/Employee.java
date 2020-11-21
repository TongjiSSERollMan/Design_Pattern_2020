package com.github.tongjisserollman.iceamusementpark.converter;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

public class Employee {
    public String name;
    public String id;
    public String office;
    public String home;

    Employee(String name, String id, String office, String home){
        this.name = name;
        this.id = id;
        this.office = office;
        this.home = home;
    }


    public void inspect(){
        CallStackLogger.log(new CallStackLogInfo(
                "Employee",
                "inspect", String.valueOf(System.identityHashCode(this)),
                "检查 Employee 的属性"
        ));

        System.out.println("Employee:" +
                " name = " + this.name +
                " id = " + this.id +
                " home = " + this.home +
                " office = " + this.office
        );
    }
}

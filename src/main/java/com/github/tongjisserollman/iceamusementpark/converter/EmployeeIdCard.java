package com.github.tongjisserollman.iceamusementpark.converter;

import com.github.tongjisserollman.iceamusementpark.util.*;

public class EmployeeIdCard {
    public String id;
    public String name;

    public EmployeeIdCard(String id, String name){
        this.id = id;
        this.name = name;
    }

    public void inspect(){
        CallStackLogger.log(new CallStackLogInfo(
            "EmployeeIdCard",
                "inspect",
                String.valueOf(System.identityHashCode(this)),
                "检查 EmployeeIdCard 的属性"
        ));

        System.out.println("Employee:" +
                " name = " + this.name +
                " id = " + this.id
        );
    }
}

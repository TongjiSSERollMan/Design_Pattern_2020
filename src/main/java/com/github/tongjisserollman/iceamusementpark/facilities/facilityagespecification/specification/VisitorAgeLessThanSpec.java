package com.github.tongjisserollman.iceamusementpark.facilities.facilityagespecification.specification;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;
import com.github.tongjisserollman.iceamusementpark.util.Visitor;

/**
 * @author HR8398Cephei
 *
 * 判断游客年龄是否小于 age 的规约
 */
public class VisitorAgeLessThanSpec extends CompositeSpecification<Visitor> {
    private int age;

    public VisitorAgeLessThanSpec(int age) {
        this.age = age;
    }

    @Override
    public boolean isSatisfiedBy(Visitor visitor) {

        boolean res = visitor.getAge() < age;

        String msg = res ?
                visitor.getName() + "通过 VisitorAgeLessThanSpec, " + visitor.getName() + "年龄小于" + age :
                visitor.getName() + "未通过 VisitorAgeLessThanSpec, " + visitor.getName() + "年龄大于等于" + age;

        CallStackLogger.log(
                new CallStackLogInfo(
                        "VisitorAgeLessThanSpec",
                        "isSatisfiedBy",
                        String.valueOf(System.identityHashCode(this)),
                        msg
                )
        );
        return res;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

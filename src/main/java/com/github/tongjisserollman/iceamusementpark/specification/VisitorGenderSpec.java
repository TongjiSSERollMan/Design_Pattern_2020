package com.github.tongjisserollman.iceamusementpark.specification;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;
import com.github.tongjisserollman.iceamusementpark.util.Gender;
import com.github.tongjisserollman.iceamusementpark.util.Visitor;

/**
 * @author HR8398Cephei
 *
 * 判断游客身性别是否为 gender 的规约
 */
public class VisitorGenderSpec extends CompositeSpecification<Visitor> {
    private Gender gender;

    public VisitorGenderSpec(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean isSatisfiedBy(Visitor visitor) {

        boolean res = visitor.getGender() == gender;

        String msg = res ?
                visitor.getName() + "通过 VisitorGenderSpec, " + visitor.getName() + "性别为" + gender :
                visitor.getName() + "未通过 VisitorGenderSpec, " + visitor.getName() + "性别为" + gender;

        CallStackLogger.log(
                new CallStackLogInfo(
                        "VisitorGenderSpec",
                        "isSatisfiedBy",
                        String.valueOf(System.identityHashCode(this)),
                        msg
                )
        );
        return res;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}

package com.github.tongjisserollman.iceamusementpark.facilities.facilityagespecification.specification;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;
import com.github.tongjisserollman.iceamusementpark.util.Visitor;

/**
 * @author HR8398Cephei
 *
 * 判断游客身高是否低于 height 的规约
 */
public class VisitorHeightLessThanSpec extends  CompositeSpecification<Visitor> {
    private double height;

    public VisitorHeightLessThanSpec(double height) {
        this.height = height;
    }

    @Override
    public boolean isSatisfiedBy(Visitor visitor) {
        boolean res = visitor.getHeight() < height;

        String msg = res ?
                visitor.getName() + "通过 VisitorHeightLessThanSpec, " + visitor.getName() + "身高小于" + height :
                visitor.getName() + "未通过 VisitorHeightLessThanSpec, " + visitor.getName() + "身高大于等于" + height;

        CallStackLogger.log(
                new CallStackLogInfo(
                        "VisitorHeightLessThanSpec",
                        "isSatisfiedBy",
                        String.valueOf(System.identityHashCode(this)),
                        msg
                )
        );
        return res;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

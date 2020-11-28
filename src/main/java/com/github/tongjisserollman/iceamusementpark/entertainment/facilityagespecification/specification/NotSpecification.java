package com.github.tongjisserollman.iceamusementpark.entertainment.facilityagespecification.specification;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;
import com.github.tongjisserollman.iceamusementpark.util.Visitor;

/**
 * @author HR8398Cephei
 * @param <T> 进行规约的类
 *
 * 规约进行链式操作 not 后产生的规约
 */
public class NotSpecification<T> extends CompositeSpecification<T> {

    private final Specification<T> spec;

    public NotSpecification(Specification<T> spec) {
        this.spec = spec;
    }

    @Override
    public boolean isSatisfiedBy(T t) {
        boolean res = !spec.isSatisfiedBy(t);

        if (t instanceof Visitor) {
            String msg = res ?
                    ((Visitor) t).getName() + "通过 NotSpecification" :
                    ((Visitor) t).getName() + "未通过 NotSpecification";

            CallStackLogger.log(
                    new CallStackLogInfo(
                            "NotSpecification",
                            "isSatisfiedBy",
                            String.valueOf(System.identityHashCode(this)),
                            msg
                    )
            );
        }

        return res;
    }
}

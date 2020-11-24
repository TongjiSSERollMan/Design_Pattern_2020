package com.github.tongjisserollman.iceamusementpark.specification;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author HR8398Cephei
 * @param <T> 用于规约的类
 *
 * 组合规约，可进行 and, or, not 链式操作
 */
public abstract class CompositeSpecification<T> implements Specification<T> {

    /**
     * 判断对象 t 是否满足当前规约
     *
     * @param t 判断是否满足当前规约的类
     * @return 是否满足当前规约
     */
    @Override
    public abstract boolean isSatisfiedBy(T t);

    /**
     * 进行 spec1.and(spec2) 链式操作，得到一个新规约，满足新规约需同时满足规约 spec1, spec2
     *
     * @param spec 与当前规约进行 and 链式操作的另一个规约
     * @return 一个新的组合规约，类型为 AndSpecification
     */
    @Override
    public Specification<T> and(Specification<T> spec) {
        return new AndSpecification<>(this, spec);
    }

    /**
     * 进行 spec1.or(spec2) 链式操作，得到一个新规约，满足新规约需满足规约 spec1, spec2 中的一个
     *
     * @param spec 与当前规约进行 or 链式操作的另一个规约
     * @return 一个新的组合规约，类型为 OrSpecification
     */
    @Override
    public Specification<T> or(Specification<T> spec) {
        return new OrSpecification<>(this, spec);
    }

    /**
     * 进行 spec.not() 操作，得到一个新规约，满足新规约需不满足规约 spec
     *
     * @return 一个新的组合规约，类型为 NotSpecification
     */
    @Override
    public Specification<T> not() {
        return new NotSpecification<>(this);
    }
}

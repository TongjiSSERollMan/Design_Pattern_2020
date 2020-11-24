package com.github.tongjisserollman.iceamusementpark.specification;

/**
 * @author HR8398Cephei
 * @param <T> 用于规约的类
 *
 * 规约接口，规约可进行链式操作and, or, not
 */
public interface Specification<T> {
    /**
     * 对象t是否满足当前规约
     *
     * @param t 判断是否满足当前规约的类
     * @return 是否满足当前规约
     */
    boolean isSatisfiedBy(T t);

    /**
     * 进行 spec1.and(spec2) 链式操作，得到一个新规约，满足新规约需同时满足规约 spec1, spec2
     *
     * @param spec 与当前规约进行 and 链式操作的另一个规约
     * @return 一个新规约。
     */
    Specification<T> and(Specification<T> spec);

    /**
     * 进行 spec1.or(spec2) 链式操作，得到一个新规约，满足新规约需满足规约 spec1, spec2 中的一个
     *
     * @param spec 与当前规约进行 or 链式操作的另一个规约
     * @return 一个新规约。
     */
    Specification<T> or(Specification<T> spec);

    /**
     * 进行 spec.not() 操作，得到一个新规约，满足新规约需不满足规约 spec
     *
     * @return 一个新规约
     */
    Specification<T> not();
}

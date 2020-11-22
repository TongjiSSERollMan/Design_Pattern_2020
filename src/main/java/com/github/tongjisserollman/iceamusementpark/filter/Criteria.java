package com.github.tongjisserollman.iceamusementpark.filter;

import java.util.List;

/**
 * @author hq
 *  过滤适用不同情况的游乐项目
 */
public interface Criteria {
    /**
     * 过滤标准
     */
    public List<Facility> meetCriteria(List<Facility> facility);
}
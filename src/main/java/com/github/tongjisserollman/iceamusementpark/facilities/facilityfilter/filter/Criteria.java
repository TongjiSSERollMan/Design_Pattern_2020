package com.github.tongjisserollman.iceamusementpark.facilities.facilityfilter.filter;

import java.util.List;

/**
 * @author hq
 *  过滤适用不同情况的游乐项目
 */
public interface Criteria {
    /**
     * 过滤标准
     *
     * @param facility 游乐设施
     * @return 过滤后符合要求的设施
     */
    public List<Facility> meetCriteria(List<Facility> facility);

}
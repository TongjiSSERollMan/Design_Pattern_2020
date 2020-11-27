package com.github.tongjisserollman.iceamusementpark.filter;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
/**
 * @author hq
 */
public class FilterTest {
    @Test
    void testFilter() {
        List<Facility> facilities = new ArrayList<Facility>();
        facilities.add(new Facility("鬼屋", 18, "thrilling"));
        facilities.add(new Facility("旋转茶杯", 7, "mild"));
        facilities.add(new Facility("海盗船", 18, "thrilling"));
        facilities.add(new Facility("摩天轮", 9, "mild"));

        Criteria adult = new CriteriaAdult();
        adult.meetCriteria(facilities);
        Criteria minor = new CriteriaMinor();
        minor.meetCriteria(facilities);
        Criteria mild = new CriteriaMild();
        mild.meetCriteria(facilities);
        Criteria thrilling = new CriteriaThrilling();
        thrilling.meetCriteria(facilities);

    }
}

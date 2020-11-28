package com.github.tongjisserollman.iceamusementpark.pipeline;

import com.github.tongjisserollman.iceamusementpark.base.pipe.pipeline.BasicValve;
import com.github.tongjisserollman.iceamusementpark.base.pipe.pipeline.SecondValve;
import com.github.tongjisserollman.iceamusementpark.base.pipe.pipeline.StandardPipeline;
import com.github.tongjisserollman.iceamusementpark.base.pipe.pipeline.ThirdValve;
import org.junit.jupiter.api.Test;

public class PipelineTest {
    @Test
    public void testPipeline() {
        String s = "test";
        StandardPipeline pipeline = new StandardPipeline();
        BasicValve basic = new BasicValve();
        SecondValve second = new SecondValve();
        ThirdValve third = new ThirdValve();
        pipeline.setBasic(basic);
        pipeline.addValve(second);
        pipeline.addValve(third);
        pipeline.getFirst().invoke(s);
    }
}

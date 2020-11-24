package com.github.tongjisserollman.iceamusementpark.pipeline;

import static org.junit.jupiter.api.Assertions.*;

class StandardPipelineTest {
    @org.junit.jupiter.api.Test
    public void StandardPipelineTest() {
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
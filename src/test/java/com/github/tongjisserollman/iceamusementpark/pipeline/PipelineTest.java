package com.github.tongjisserollman.iceamusementpark.pipeline;

public class PipelineTest {
    @org.junit.jupiter.api.Test
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

package com.github.tongjisserollman.iceamusementpark.blackboard;

import org.junit.jupiter.api.Test;

/**
 * @author hq
 */
public class BlackboardTest {
    @Test
    void blackboardTest(){
        Topic topic1 = new Topic("优惠好省");
        Topic topic2 = new Topic("活动专栏");
        Subscriber sub1 = new Subscriber("sub1");
        Subscriber sub2 = new Subscriber("sub2");
        Subscriber sub3 = new Subscriber("sub3");
        topic1.addSubscriber(sub1);
        topic1.addSubscriber(sub2);
        topic2.addSubscriber(sub3);
        topic1.publishInfo("有优惠11");
        topic1.publishInfo("有优惠2222");
        topic2.publishInfo("主题活动333333");
        topic1.notifySubscriber();
        topic2.notifySubscriber();
    }
}

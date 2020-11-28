package com.github.tongjisserollman.iceamusementpark.proxy;

import com.github.tongjisserollman.iceamusementpark.office.principal.proxy.Principal;
import com.github.tongjisserollman.iceamusementpark.office.principal.proxy.RealPrincipal;
import com.github.tongjisserollman.iceamusementpark.office.principal.proxy.SecretaryPrincipal;
import org.junit.jupiter.api.Test;

class ProxyTest {

    @Test
    public void testProxy() {
        Principal secretaryPrinciple = new SecretaryPrincipal("请秘书召集所有员工开会。");
        Principal realPrinciple = new RealPrincipal("召集所有员工开会");
        //执行任务
        realPrinciple.performTask();
        System.out.println("请秘书");

        secretaryPrinciple.performTask();
    }

}
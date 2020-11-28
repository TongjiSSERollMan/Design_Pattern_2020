package com.github.tongjisserollman.iceamusementpark.nullobject;

import com.github.tongjisserollman.iceamusementpark.stage.actor.nullobject.AbstractActor;
import com.github.tongjisserollman.iceamusementpark.stage.actor.nullobject.ActorFactory;
import org.junit.jupiter.api.Test;

public class NullObjectTest {

    @Test
    void testNullObject(){
        System.out.println("空对象模式测试：");

        String[] names = {"魔术师赫敏","教授邓布利多","歌唱家哈利","角斗士罗恩","家养小精灵多比"};

        AbstractActor[] actor = new AbstractActor[names.length];
        for (int i =0;i<names.length;i++){
            actor[i]= ActorFactory.getActor(names[i]);
        }
        for (AbstractActor abstractActor : actor) {
            System.out.println("现在给我们带来表演的是" + abstractActor.getName() + "！");
        }
    }
}

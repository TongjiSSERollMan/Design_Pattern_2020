package com.github.tongjisserollman.iceamusementpark.extensionobject;

import com.github.tongjisserollman.iceamusementpark.shows.opera.extensionobject.*;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import org.junit.jupiter.api.Test;

class ExtensionObjectTest {

    @Test
    void testExtensionObject(){
        Role princeWarriorRole = new PrinceWarriorRole("小王");
        String warriorExtensionName = WarriorExtension.class.getName();
        String princeExtensionName = PrinceExtension.class.getName();

        Extension extension;
        extension = princeWarriorRole.getExtension(warriorExtensionName);
        if (extension != null) {
            WarriorExtension warriorExtension = (WarriorExtension)extension;
            warriorExtension.fight();
        }

        princeWarriorRole.removeExtension(princeExtensionName);
        extension = princeWarriorRole.getExtension(princeExtensionName);
        if (extension == null) {
            new CallStackLogInfo(
                    "ExtensionObjectTest",
                    "princeWarriorTest",
                    String.valueOf(System.identityHashCode(this)),
                    "没有找到王子插件"
            );
        }
        System.out.println(PrinceExtension.class.getName());
        princeWarriorRole.addExtension(PrinceExtension.class.getName());
        extension =  princeWarriorRole.getExtension(PrinceExtension.class.getName());
        if (extension != null) {
            ((PrinceExtension)extension).greet();
        }

    }
}
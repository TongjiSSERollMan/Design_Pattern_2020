package com.github.tongjisserollman.iceamusementpark.base.bgm.flyweight;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

import java.util.HashMap;

/**
 * @author: hq
 * @description: 实现FlyWeight所必需的特殊工厂类。该类仅在生产每个类别的第一个实例时调用构造函数，其余全部返回引用
 */
public class BGMFactory {
    private static final HashMap<String, BGM> pool = new HashMap<String, BGM>();

    /**
     * @description: 根据name获取对应的BGM对象。
     * 如果该bgm已被实例化过，则返回其引用
     * 否则添加一个新的bgm
     */
    public static BGM getBGM(String name) {
        BGM bgm = (BGM)pool.get(name);
        if (bgm == null) {
            bgm = new BGM(name);
            pool.put(name,bgm);

            CallStackLogger.log(
                    new CallStackLogInfo(
                            "BGMFactory",
                            "getBGM",
                            String.valueOf(System.identityHashCode(111111)),
                            "新增BGM:" + name
                    )
            );
        }
        return pool.get(name);
    }
}


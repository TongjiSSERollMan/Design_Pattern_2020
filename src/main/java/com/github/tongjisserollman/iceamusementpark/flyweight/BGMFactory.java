package com.github.tongjisserollman.iceamusementpark.flyweight;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

import java.util.HashMap;

/**
 * @author: hq
 * @description: 实现FlyWeight所必需的特殊工厂类。该类仅在生产每个类别的第一个实例时调用构造函数，其余全部返回引用
 */
public class BGMFactory {
    static private BGMFactory instance;
    private HashMap<String, BGM> pool = new HashMap<String, BGM>();

    private BGMFactory() {
    }

    /**
     * @description: 单例模式返回唯一实例
     */
    static public BGMFactory getInstance() {
        if (instance == null) {
            instance = new BGMFactory();
        }
        return instance;
    }

    /**
     * @description: 根据name获取对应的Ingredient对象。
     * 如果该bgm已被实例化过，则返回其引用
     * 否则添加一个新的bgm
     */
    public BGM getBGM(String name) {
        if (pool.get(name) == null) {
            BGM ingredient = new BGM(name);
            pool.put(name, ingredient);

            CallStackLogger.log(
                    new CallStackLogInfo(
                            "BGMFactory",
                            "getBGM",
                            String.valueOf(System.identityHashCode(this)),
                            "新增BGM:" + name
                    )
            );
        }
        return pool.get(name);
    }
}


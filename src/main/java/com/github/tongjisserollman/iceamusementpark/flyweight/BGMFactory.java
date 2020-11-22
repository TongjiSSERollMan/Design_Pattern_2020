package com.github.tongjisserollman.iceamusementpark.flyweight;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;
import java.util.HashMap;

/**
 * @author hq
 */
public class BGMFactory {

    private HashMap<String, ConcreteBGM> pool = new HashMap<>();
    /**
     * 获得BGM分类
     */
    public ConcreteBGM getBGMName(String key) {
        if(!pool.containsKey(key)) {
            pool.put(key, new ConcreteBGM(key));
        }
        return (ConcreteBGM)pool.get(key);
    }
    /**
     * 获得BGM总数
     */
    public int getBGMCount() {
        return pool.size();
    }
}

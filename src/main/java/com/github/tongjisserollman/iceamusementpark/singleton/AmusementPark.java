package com.github.tongjisserollman.iceamusementpark.singleton;
/**
 * @author Moreonenight
 *
 * 游乐场本身
 */
public enum AmusementPark {
    // 用枚举类型实现单例模式
    INSTANCE;
    public static AmusementPark getInstance(){
        return INSTANCE;
    }
}

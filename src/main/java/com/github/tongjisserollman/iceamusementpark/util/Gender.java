package com.github.tongjisserollman.iceamusementpark.util;

/**
 * @author HR8398Cephei
 *
 * 游客性别
 */
public enum Gender {
    /**
     * 男性
     */
    MALE,

    /**
     * 女性
     */
    FEMALE;

    @Override
    public String toString() {
        return this == Gender.FEMALE ? "女" : "男";
    }
}
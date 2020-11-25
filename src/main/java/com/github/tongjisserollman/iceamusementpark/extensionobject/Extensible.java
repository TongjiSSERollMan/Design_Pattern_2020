package com.github.tongjisserollman.iceamusementpark.extensionobject;

/**
 * @author rand1925
 *
 * 可扩展对象
 */
public interface Extensible {
    /**
     * 获得特定的扩展对象
     *
     * @param extensionName 扩展类名
     * @return 特定的扩展对象
     */
    Extension getExtension(String extensionName);

    /**
     * 删除特定扩展对象
     *
     * @param extensionName 扩展类名
     */
    void removeExtension(String extensionName);

    /**
     * 添加特定扩展对象
     *
     * @param extensionName 扩展类名
     */
    void addExtension(String extensionName);
}

package com.github.tongjisserollman.iceamusementpark.mediator;

/**
 * @author Mrcopytuo
 *
 * 中介系统接口
 */

public interface Mediator {
    public void addShop(Shop shop);
    public void tellMsg(Shop shop, String str);
}

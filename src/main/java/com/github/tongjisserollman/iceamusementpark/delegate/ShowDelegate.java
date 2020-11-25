package com.github.tongjisserollman.iceamusementpark.delegate;

import java.util.Random;

/**
 * @author aodethri
 *
 * 表演代理类
 */
public class ShowDelegate implements Show {

    @Override
    public void startShow() {
        Show show;
        if (new Random().nextBoolean()) {
            show = new MonkeyShow();
        } else {
            show = new LionShow();
        }
        show.startShow();
    }
}

package com.github.tongjisserollman.iceamusementpark.entertainment.skating.adapter;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;
import com.github.tongjisserollman.iceamusementpark.util.Visitor;

/**
 * @author HR8398Cephei
 *
 * 冰鞋适配器
 */
public class SkatingShoeAdapter implements Skatable {
    /**
     * 需要使用冰鞋进行溜冰的游客
     */
    private Visitor visitor;

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public SkatingShoeAdapter(Visitor visitor) {
        this.visitor = visitor;
    }

    /**
     * 游客穿上冰鞋后进行溜冰
     */
    @Override
    public void skate() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "SkatingShoeAdapter",
                        "skate",
                        String.valueOf(System.identityHashCode(this)),
                        "游客穿上冰鞋后溜冰"
                )
        );

        visitor.walk();
    }
}

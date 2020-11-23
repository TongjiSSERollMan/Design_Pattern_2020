package com.github.tongjisserollman.iceamusementpark.nullobject;

public class NullActor extends AbstractActor {
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "...哦，现在没有人为我们表演，大家可以自由使用舞台！";
    }

}

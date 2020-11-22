package com.github.tongjisserollman.iceamusementpark.nullobject;

public class ActorFactory {
    public static final String[] names = {"歌唱家哈利","魔术师赫敏","角斗士罗恩"};

    public static AbstractActor getActor(String name){
        for (int i=0;i<names.length;i++){
            if(names[i].equalsIgnoreCase(name)){
                return new RealActor(name);
            }
        }
        return new NullActor();
    }
}

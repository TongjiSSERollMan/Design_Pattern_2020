package com.github.tongjisserollman.iceamusementpark.mediator;

public class Mediator {
    public static void tellLack(Shop shop, String str){
        System.out.println("商店名："+shop.getName()+"\t需求："+str);
    }
}

package com.github.tongjisserollman.iceamusementpark.mediator;

public class Shop {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String str){
        this.name=str;
    }
    public Shop(String str){
        this.name=str;
    }
    public void sendLackMessage(String str){
        Mediator.tellLack(this,str);
    }
}

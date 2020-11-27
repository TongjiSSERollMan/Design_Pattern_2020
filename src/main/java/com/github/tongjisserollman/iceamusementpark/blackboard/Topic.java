package com.github.tongjisserollman.iceamusementpark.blackboard;

import java.util.ArrayList;

/**
 * @author hq
 */
public class Topic {
    String name;

    Topic(String name){
        this.name = name;
    }

    /**
     * @description: 获取主题名称
     * @return: 返回主题名称
     */
    public String getName(){
        return name;
    }

    private ArrayList<Subscriber> subscriberArrayList = new ArrayList<>();
    private ArrayList<String> infoArrayList = new ArrayList<>();

    /**
     * @description: 主题增加发布消息
     */
    public void publishInfo(String info) {
        infoArrayList.add(info);
    }

    /**
     * @description: 有游客订阅该主题，增加主题的订阅者
     */
    public void addSubscriber(Subscriber subscriber){
        subscriberArrayList.add(subscriber);
    }

    /**
     * @description: 主题给订阅者发布消息
     */
    public void notifySubscriber(){
        for(Subscriber subscriber:subscriberArrayList){
            for(String info:infoArrayList){
                subscriber.receiveInfo(this.name + ":" + info);
            }
        }
    }
}

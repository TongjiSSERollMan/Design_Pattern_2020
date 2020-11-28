package com.github.tongjisserollman.iceamusementpark.base.noticeboard.blackboard;

/**
 * @author aodethri
 *
 * 消息源类
 */
public class NoticeSource {

    /**
     * 消息源所携带的消息
     */
    private String message;

    /**
     * 通知栏实体
     */
    Blackboard blackboard;

    public NoticeSource(String message, Blackboard blackboard){
        this.message = message;
        this.blackboard = blackboard;
    }

    /**
     * 在通知栏上写下通知
     */
    public void updateBlackboard(){
        blackboard.update(message);
    }
}

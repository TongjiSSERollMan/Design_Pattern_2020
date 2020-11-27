package com.github.tongjisserollman.iceamusementpark.blackboard;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;
import java.util.ArrayList;

/**
 * @author aodethri
 *
 * 黑板类，相当于公告栏
 */
public class Blackboard {

    /**
     * 公告栏上的内容
     */
    ArrayList<String> messageList;

    public Blackboard(){
        this.messageList = new ArrayList<>();
    }

    /**
     * 展示公告栏上的内容
     */
    public void inspect(){
        int count = 1;
        for(String s : messageList){
            String msg = "公告" + count + ": " + s;
            ++count;

            CallStackLogger.log(
                    new CallStackLogInfo(
                            "Blackboard",
                            "inspect",
                            String.valueOf(System.identityHashCode(this)),
                            msg
                    )
            );
        }
    }

    /**
     * 在公告栏上增加内容
     * @param s 要增加的内容
     */
    public void update(String s){
        messageList.add(s);
    }
}

package com.github.tongjisserollman.iceamusementpark.memento;

import java.util.ArrayList;
import java.util.List;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author zactWu
 *
 * 恢复游玩过飞镖的游玩者姓名与分数
 */
public class RecordList {
    private List<RecordMemento> recordList = new ArrayList<RecordMemento>();
    /**
     * 添加游玩记录
     * @param record 游玩记录
     */
    public void add(RecordMemento record){
        recordList.add(record);
    }
    /**
     * 获取某一游玩记录
     * @param index 游玩记录序号
     */
    public void get(int index){
        RecordMemento memento = recordList.get(index);
        CallStackLogger.log(
                new CallStackLogInfo(
                        "RecordList",
                        "get",
                        String.valueOf(System.identityHashCode(this)),
                        "游玩人："+memento.getName()+" 分数："+memento.getScore()
                )
        );
    }
}

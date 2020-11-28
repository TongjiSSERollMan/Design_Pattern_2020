package com.github.tongjisserollman.iceamusementpark.facilities.dart.memento;

/**
 * @author zactWu
 *
 * 创建飞镖游玩者姓名与分数信息并存储到mememto中
 */
public class ScoreOriginator {
    private int score;
    private String player_name;
    /**
     * 记录当前游玩者姓名与分数
     * @param score 飞镖得分
     * @param player_name 游玩者姓名
     */
    public void setRecord(int score, String player_name){
        this.score = score;
        this.player_name = player_name;
    }
    /**
     * 获取分数
     * @return score
     */
    public int getScore(){
        return score;
    }
    /**
     * 获取游玩者姓名
     * @return player_name
     */
    public String getName(){
        return player_name;
    }
    /**
     * 将当前记录存储到RecordMemento中
     * @return RecordMemento
     */
    public RecordMemento saveRecordToMemento(){
        return new RecordMemento(score,player_name);
    }

}


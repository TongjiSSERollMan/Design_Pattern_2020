package com.github.tongjisserollman.iceamusementpark.facilities.dart.memento;

/**
 * @author zactWu
 *
 * 存储游玩过飞镖的游玩者姓名与分数
 */
public class RecordMemento {
    private int score;
    private String player_name;

    public RecordMemento(int score, String player_name){
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
}


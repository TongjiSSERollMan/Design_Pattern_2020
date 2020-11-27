package com.github.tongjisserollman.iceamusementpark.memento;

import org.junit.jupiter.api.Test;

public class MementoTest {

    @Test
    void testMemento() {
        ScoreOriginator scoreOriginator = new ScoreOriginator();
        RecordList dartsRecordList = new RecordList();
        scoreOriginator.setRecord(80,"飞镖入门者");
        dartsRecordList.add(scoreOriginator.saveRecordToMemento());
        scoreOriginator.setRecord(90,"飞镖大师");
        dartsRecordList.add(scoreOriginator.saveRecordToMemento());
        scoreOriginator.setRecord(100,"同济飞镖超人");
        dartsRecordList.add(scoreOriginator.saveRecordToMemento());

        System.out.println("当前游玩者"+scoreOriginator.getName()+"的当前分数为"+scoreOriginator.getScore());
        for (int i=2;i>=0;i--) {
            dartsRecordList.get(i);
        }

    }
}

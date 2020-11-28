package com.github.tongjisserollman.iceamusementpark.facilities.ballgame.mutex;

/**
 * @author aodethri
 *
 * 游客类
 */
public class Visitor extends Thread {

    /**
     * 游客名字
     */
    private final String name;

    /**
     * 球的具体类
     */
    private final Ball ball;

    public Visitor(String name, Ball ball){
        this.name = name;
        this.ball = ball;
    }

    @Override
    public void run() {
        int count = 0;
        while(ball.takeBall()){
            ++count;
            String msg = name + "抢到了一个球";
            System.out.println(msg);
        }
        String msg = name + "抢到了" + count + "个球";
        System.out.println(msg);
    }
}

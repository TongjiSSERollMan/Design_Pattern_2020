package com.github.tongjisserollman.iceamusementpark.interpreter;

public class Num implements Expression {
    private int number;

    public Num(int number) {
        this.number = number;
    }

    // 返回值就是数字本身
    @Override
    public int interpret() {
        return number;
    }
}
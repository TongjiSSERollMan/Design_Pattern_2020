package com.github.tongjisserollman.iceamusementpark.base.calculator.interpreter;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

public class Mul implements Expression {
    private Expression left, right;

    public Mul(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {

        CallStackLogger.log(
                new CallStackLogInfo(
                        "Mu了",
                        "interpret",
                        String.valueOf(System.identityHashCode(this)),
                        "解析两个数相乘的值"
                )
        );
        return left.interpret() * right.interpret();
    }
}

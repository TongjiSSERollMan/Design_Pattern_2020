package com.github.tongjisserollman.iceamusementpark.base.calculator.interpreter;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

public class Div implements Expression {
    private Expression left, right;

    public Div(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {

        CallStackLogger.log(
                new CallStackLogInfo(
                        "Div",
                        "interpret",
                        String.valueOf(System.identityHashCode(this)),
                        "解析两个数相除的值"
                )
        );

        if (right.interpret() != 0) {
            return left.interpret() / right.interpret();
        } else {
            //应该是错误
            return 0;
        }
    }
}

package com.github.tongjisserollman.iceamusementpark.interpreter;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

public class Sub implements Expression {
    private Expression left, right;

    public Sub(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {

        CallStackLogger.log(
                new CallStackLogInfo(
                        "Sub",
                        "interpret",
                        String.valueOf(System.identityHashCode(this)),
                        "解析两个数相减的值"
                )
        );
        return left.interpret() - right.interpret();
    }
}

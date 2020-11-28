package com.github.tongjisserollman.iceamusementpark.base.pipe.pipeline;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author xuedixuedi
 */
public class StandardPipeline implements Pipeline {
    //第一个阀门
    protected Valve first;
    //基础阀门
    protected Valve basic;

    @Override
    public Valve getFirst() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "StandardPipeline",
                        "getFirst",
                        String.valueOf(System.identityHashCode(this)),
                        "返回阀门的第一个阀门"
                )
        );
        return first;
    }

    @Override
    public Valve getBasic() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "StandardPipeline",
                        "getBasic",
                        String.valueOf(System.identityHashCode(this)),
                        "返回阀门的第基础阀门"
                )
        );
        return basic;
    }

    @Override
    public void setBasic(Valve v) {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "StandardPipeline",
                        "setBasic",
                        String.valueOf(System.identityHashCode(this)),
                        "设置阀门的第基础阀门"
                )
        );
        basic = v;
    }

    /**
     * 添加阀门
     *
     * @param v
     */
    @Override
    public void addValve(Valve v) {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "StandardPipeline",
                        "addValve",
                        String.valueOf(System.identityHashCode(this)),
                        "添加阀门"
                )
        );
        if (first == null) {
            first = v;
            v.setNext(basic);
        } else {
            Valve current = first;
            while (current != null) {
                if (current.getNext() == basic) {
                    current.setNext(v);
                    v.setNext(basic);
                    break;
                }
                current = current.getNext();
            }
        }
    }
}

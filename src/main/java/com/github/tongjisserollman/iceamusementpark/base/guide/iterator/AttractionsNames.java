package com.github.tongjisserollman.iceamusementpark.base.guide.iterator;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

public class AttractionsNames implements Attractions {

    /**
     *  推荐游览顺序数组
     */
    private final String[] names = {"游乐区", "舞台区", "商业区", "办公区"};


    /**
     * @return 这个游览的导航顺序，知道这个景点游览完下一个该去哪里
     */
    @Override
    public Guide getGuidance() {
        return new AttractionsGuide();
    }

    private class AttractionsGuide implements Guide {

        int index;

        /**
         * @return 按照当前推荐游览顺序，这个景点是不是最后一个
         */
        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }

            CallStackLogger.log(
                    new CallStackLogInfo(
                            "AttractionsGuide",
                            "hasNext",
                            String.valueOf(System.identityHashCode(this)),
                            "按照当前推荐游览顺序，这个景点是不是最后一个"
                    )
            );

            return false;


        }

        /**
         * @return 按照guide的顺序的下一个景点
         */
        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            CallStackLogger.log(
                    new CallStackLogInfo(
                            "AttractionsGuide",
                            "next",
                            String.valueOf(System.identityHashCode(this)),
                            "按照guide的顺序的下一个景点"
                    )
            );
            return null;
        }

        @Override
        public int getIndex() {

            CallStackLogger.log(
                    new CallStackLogInfo(
                            "AttractionsGuide",
                            "getIndex",
                            String.valueOf(System.identityHashCode(this)),
                            "返回次序"
                    )
            );

            return index;
        }
    }
}

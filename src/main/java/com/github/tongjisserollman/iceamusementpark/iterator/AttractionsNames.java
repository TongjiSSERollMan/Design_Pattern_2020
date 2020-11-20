package com.github.tongjisserollman.iceamusementpark.iterator;

public class AttractionsNames implements Attractions {

    //推荐游览顺序数组
    public String[] names = {"娱乐场大门", "冰雕", "购物中心", "娱乐场出口"};


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
            return null;
        }

        @Override
        public int getIndex() {
            return index;
        }
    }
}

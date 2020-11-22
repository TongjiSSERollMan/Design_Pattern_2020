package com.github.tongjisserollman.iceamusementpark.chainofresponsibility;

/**
 * @author hq
 */
public class ChainOfResponsibility {
    public static void play() {

        /**
         * 创建步骤请求
         */
        int[] requestSteps = new int[]{1, 2, 3, 4, 1, 2};

        /**
         * 游玩鬼屋四步骤
         */
        BuyTicket buyTicket = new BuyTicket();
        Approach approach = new Approach();
        GoVisit goVisit = new GoVisit();
        Appearance appearance = new Appearance();

        /**
         * 步骤的责任链
         */
        buyTicket.setNext(approach);
        approach.setNext(goVisit);
        goVisit.setNext(appearance);

        for (int requestStep: requestSteps) {
            buyTicket.playStepRequest(new Request(requestStep));
        }
    }
}

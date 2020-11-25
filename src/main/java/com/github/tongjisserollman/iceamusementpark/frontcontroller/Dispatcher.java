package com.github.tongjisserollman.iceamusementpark.frontcontroller;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Mrcopytuo
 *
 * 网页调度器
 */

public class Dispatcher {
    private HomeView homeView;
    private PhotoView photoView;
    private TicketView ticketView;

    /**
     * Dispatcher构造器
     */
    public Dispatcher(){
        homeView = new HomeView();
        photoView = new PhotoView();
        ticketView = new TicketView();
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Dispatcher",
                        "Dispatcher",
                        String.valueOf(System.identityHashCode(this)),
                        "Dispatcher构造器"
                )
        );
    }

    /**
     * 获取所需页面
     */
    public void dispatch(String request){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Dispatcher",
                        "dispatch",
                        String.valueOf(System.identityHashCode(this)),
                        "获取所需页面"
                )
        );
        if(request.equalsIgnoreCase("PHOTO")){
            photoView.show();
        }
        else if(request.equalsIgnoreCase("TICKET")){
            ticketView.show();
        }
        else {
            homeView.show();
        }
    }
}

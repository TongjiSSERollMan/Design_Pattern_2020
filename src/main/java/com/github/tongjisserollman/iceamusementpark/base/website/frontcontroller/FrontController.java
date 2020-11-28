package com.github.tongjisserollman.iceamusementpark.base.website.frontcontroller;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Mrcopytuo
 *
 * 前端控制器
 */


public class FrontController {
    private Dispatcher dispatcher;

    /**
     * FrontController构造器
     */
    public FrontController(){
        dispatcher = new Dispatcher();
        CallStackLogger.log(
                new CallStackLogInfo(
                        "FrontController",
                        "FrontController",
                        String.valueOf(System.identityHashCode(this)),
                        "FrontController构造器"
                )
        );
    }

    /**
     * 认证用户身份
     */
    private boolean isAuthenticUser(){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "FrontController",
                        "isAuthenticUser",
                        String.valueOf(System.identityHashCode(this)),
                        "认证用户身份"
                )
        );
        System.out.println("用户身份成功认证");
        return true;
    }

    /**
     * 记录请求页面
     */
    private void trackRequest(String request){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "FrontController",
                        "trackRequest",
                        String.valueOf(System.identityHashCode(this)),
                        "记录请求页面"
                )
        );
        System.out.println("请求页面：" + request);
    }

    /**
     * 处理请求页面
     */
    public void dispatchRequest(String request){
        trackRequest(request);
        CallStackLogger.log(
                new CallStackLogInfo(
                        "FrontController",
                        "dispatchRequest",
                        String.valueOf(System.identityHashCode(this)),
                        "处理请求页面"
                )
        );
        if(isAuthenticUser()){
            dispatcher.dispatch(request);
        }
    }
}

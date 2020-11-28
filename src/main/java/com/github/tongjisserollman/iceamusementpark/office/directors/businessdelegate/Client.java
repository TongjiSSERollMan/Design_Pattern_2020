package com.github.tongjisserollman.iceamusementpark.office.directors.businessdelegate;

/**
 * @author aodethri
 *
 * 董事会服务客户端(表示层)
 */
public class Client {

    /**
     * 董事会服务代表对象
     */
    private DirectorsDelegate directorsDelegate;

    public Client(DirectorsDelegate directorsDelegate){
        this.directorsDelegate = directorsDelegate;
    }

    /**
     * 运行服务
     */
    public void run(){
        directorsDelegate.run();
    }
}

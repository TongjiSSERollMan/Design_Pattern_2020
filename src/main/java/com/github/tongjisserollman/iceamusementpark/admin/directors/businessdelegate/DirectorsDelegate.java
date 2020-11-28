package com.github.tongjisserollman.iceamusementpark.admin.directors.businessdelegate;

/**
 * @author aodethri
 *
 * 服务代表,提供服务方法的入口
 */
public class DirectorsDelegate {

    /**
     * 董事会服务查询对象
     */
    private DirectorsLookup lookup  = new DirectorsLookup();

    /**
     * 董事会服务业务接口
     */
    private DirectorsService directorsService;

    /**
     * 服务类型
     */
    private String serviceType;

    /**
     * 设置服务类型
     * @param serviceType 目标服务类型
     */
    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }

    /**
     * 进行服务
     */
    public void run(){
        directorsService = lookup.getDirectorsService(serviceType);
        directorsService.run();
    }
}

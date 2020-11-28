package com.github.tongjisserollman.iceamusementpark.admin.directors.businessdelegate;

/**
 * @author aodethri
 *
 * 负责获取相关业务实现的对象
 * 提供董事会代表的对象访问
 */
public class DirectorsLookup {

    /**
     * 决策服务
     */
    static final String DECISION = "Decision";

    /**
     * 执行服务
     */
    static final String EXECUTION = "Execution";

    /**
     * 会议服务
     */
    static final String MEETING = "Meeting";

    /**
     * 计划服务
     */
    static final String PLAN = "Plan";

    /**
     * 获取董事会服务
     * @param serviceType 需要的服务名
     * @return 对应的服务对象
     */
    public DirectorsService getDirectorsService(String serviceType){
        if (DECISION.equalsIgnoreCase(serviceType)) {
            return new DecisionService();
        }else if (EXECUTION.equalsIgnoreCase(serviceType)){
            return new ExecutionService();
        }else if (MEETING.equalsIgnoreCase(serviceType)){
            return new MeetingService();
        }else if(PLAN.equalsIgnoreCase(serviceType)){
            return new PlanService();
        }else {
            throw new NullPointerException("该服务不存在");
        }
    }
}

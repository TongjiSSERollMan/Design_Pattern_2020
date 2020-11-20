package com.github.tongjisserollman.iceamusementpark.template;
/**
 * @author Moreonenight
 *
 * 不同类型的游乐设施
 */
public abstract class FacilityTemplate {
    protected int facilityId;
    protected String facilityName;
    static private int myId = 0;
    public FacilityTemplate(int facilityId, String facilityName) {
        this.facilityId = facilityId;
        this.facilityName = facilityName;
    }
    public FacilityTemplate() {
        this.facilityId = myId;
        myId++;
        this.facilityName = "";
    }
    /**
     * 完成游乐项目开始前的准备工作，如检查设施等
     */
    public void initialize(){
        System.out.println("检查设施状态……");
    }
    /**
     * 检票，允许游客进入设施
     */
    public void checkIn(){
        System.out.println("游客检票进入设施……");
    }
    /**
     * 开始运行游乐设施
     */
    public void startGame(){
        System.out.println("开始运行游乐设施……");
    }
    /**
     * 运行设施
     */
    public abstract void run();
    /**
     * 结束运行游乐设施
     */
    public void endGame(){
        System.out.println("结束运行游乐设施……");
    }
    /**
     * 游客散场，进行散场后的清理和检查
     */
    public void cleanUp(){
        System.out.println("游客散场，开始清理工作……");
    };
    public final void runFacility() {
        initialize();
        checkIn();
        startGame();
        run();
        endGame();
        cleanUp();
    }
}

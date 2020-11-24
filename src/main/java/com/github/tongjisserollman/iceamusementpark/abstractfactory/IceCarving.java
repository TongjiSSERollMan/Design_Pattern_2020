package com.github.tongjisserollman.iceamusementpark.abstractfactory;

/**
 * @author Moreonenight
 *
 * 不同的冰雕
 */
public abstract class IceCarving {
    private final int carvedId;
    private String carvedName;
    static private int counterId = 0;
    public IceCarving(String carvedName) {
        this.carvedId = counterId;
        counterId++;
        this.carvedName = carvedName;
    }
    public int getCarvedId() {
        return carvedId;
    }
    public String getCarvedName() {
        return carvedName;
    }
    public void setCarvedName(String carvedName) {
        this.carvedName = carvedName;
    }
    /**
     * 启动冰雕上的彩灯及其他装饰物
     */
    public abstract void run();
}

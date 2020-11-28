package com.github.tongjisserollman.iceamusementpark.admin.monitor.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HR8398Cephei
 *
 * 游客系统
 */
public class VisitorsSystem {

    /**
     * 游乐园内人数
     */
    private int visitorsCount = 0;

    /**
     * 观察游乐园内人数的观察者
     */
    private List<VisitorObserver> observers = new ArrayList<>();

    /**
     * 唯一的游客系统实例
     */
    private static VisitorsSystem visitorsSystem = new VisitorsSystem();

    /**
     * 获取游客系统单例
     *
     * @return 游客系统单例
     */
    public static VisitorsSystem getInstance() {
        return visitorsSystem;
    }

    /**
     * 游客系统仅有一个实例，需使构造函数成为private
     */
    private VisitorsSystem() {
    }

    /**
     * 增加游客人数
     */
    public void increaseVisitorsCount() {
        ++visitorsCount;
        notifyAllObservers();
    }

    /**
     * 减少游客人数
     */
    public void decreaseVisitorsCount() {
        --visitorsCount;
        notifyAllObservers();
    }

    /**
     * 通知所有观察者进行更新
     */

    public void notifyAllObservers() {
        for (VisitorObserver observer: observers) {
            observer.update();
        }
    }

    /**
     * 加入新的观察者
     *
     * @param observer 所需加入的观察者
     */
    public void attach(VisitorObserver observer) {
        observers.add(observer);
    }

    /**
     * 移除观察者
     *
     * @param observer 所需移除的观察者
     */
    public void detach(VisitorObserver observer) {
        observers.remove(observer);
    }

    public int getVisitorsCount() {
        return visitorsCount;
    }
}

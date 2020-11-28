package com.github.tongjisserollman.iceamusementpark.util;

import com.github.tongjisserollman.iceamusementpark.entertainment.skiing.strategy.SkiStrategy;

/**
 * @author HR8398Cephei
 *
 * 游客
 */
public class Visitor implements Walkable {
    /**
     * 滑雪方式
     */
    private SkiStrategy skiStrategy;

    /**
     * 游客年龄
     */
    private int age;

    /**
     * 游客名字
     */
    private String name;

    /**
     * 游客身高
     */
    private double height;

    /**
     * 游客性别
     */
    private Gender gender;

    public Visitor(String name) {
        this.name = name;
    }

    public void ski() {
        skiStrategy.ski(name);
    }

    public void enterAccess(){
        System.out.println("游客进入了员工通道");
    }

    @Override
    public void walk() {
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Visitor",
                        "walk",
                        String.valueOf(System.identityHashCode(this)),
                        "游客行走"
                )
        );
    }

    public Visitor setSkiStrategy(SkiStrategy skiStrategy) {
        this.skiStrategy = skiStrategy;
        return this;
    }


    public Visitor setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Visitor setAge(int age) {
        this.age = age;
        return this;
    }

    public double getHeight() {
        return height;
    }

    public Visitor setHeight(double height) {
        this.height = height;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public Visitor setGender(Gender gender) {
        this.gender = gender;
        return this;
    }
}

package com.github.tongjisserollman.iceamusementpark.specification;

/**
 * @author HR8398Cephei
 *
 * 游客
 */
public class Visitor {

    private int age;

    private String name;

    private double height;

    private Gender gender;

    public Visitor(String name, int age, double height, Gender gender) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}

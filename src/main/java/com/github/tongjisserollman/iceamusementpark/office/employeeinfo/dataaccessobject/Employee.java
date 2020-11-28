package com.github.tongjisserollman.iceamusementpark.office.employeeinfo.dataaccessobject;

/**
 * @author Major333
 *
 * 游乐场的员工类
 */
public class Employee {
    private int id;
    private String name;
    private double salary;

    /**
     * 游乐场的员工类的构造函数
     * @param id 员工id
     * @param name 员工名称
     * @param salary 员工薪水
     */
    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
}

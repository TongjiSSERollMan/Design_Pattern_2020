package com.github.tongjisserollman.iceamusementpark.office.employeeinfo.dataaccessobject;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Major333
 *
 * 游乐场的员工的数据操作类
 */
public class EmployeeDaoImpl implements EmployeeDao{

    /**
     * 列表当作数据库
     */
    private final List<Employee> employees;
    private int nextId;

    /**
     * 游乐场的员工的数据操作类的构造函数
     */
    public EmployeeDaoImpl(){
        employees = new ArrayList<Employee>();
        nextId = 0;
    }

    /**
     * 获取当前游乐场的所有员工数据
     * @return 包含所有员工对象的数组
     */
    @Override
    public List<Employee> getAllEmployees() {
        CallStackLogger.log(
            new CallStackLogInfo(
                    "EmployeeDaoImpl",
                    "getAllEmployee",
                    String.valueOf(System.identityHashCode(this)),
                    "查找所有员工"
            )
        );

        return this.employees;
    }

    /**
     * 获取当前游乐场的某个id的员工
     * @param id 要查询的id
     * @return 如果有匹配的id则返回员工信息，否则返回null
     */
    @Override
    public Employee getEmployee(int id) {
        CallStackLogger.log(
            new CallStackLogInfo(
                    "EmployeeDaoImpl",
                    "getEmployee",
                    String.valueOf(System.identityHashCode(this)),
                    "查找员工: "+String.valueOf(id)
            )
        );

        for (Employee employee :this.employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    /**
     * 更新游乐场的某个员工信息
     * 如果有匹配的id则更新员工信息，否则等价为空操作
     * @param id 员工id
     * @param salary 员工最新薪水
     */
    @Override
    public void updateEmployee(int id, double salary) {
        CallStackLogger.log(
            new CallStackLogInfo(
                    "EmployeeDaoImpl",
                    "updateEmployee",
                    String.valueOf(System.identityHashCode(this)),
                    "更新员工: "+String.valueOf(id) + " 最新薪水: " + String.valueOf(salary)
            )
        );

        for (Employee employee : this.employees) {
            if (employee.getId() == id) {
                employee.setSalary(salary);
                break;
            }
        }
    }

    /**
     * 删除游乐场的某个员工信息
     * 如果有匹配的id则删除员工信息，否则等价为空操作
     * @param id 需要删除的员工的id
     */
    @Override
    public void deleteEmployee(int id) {
        CallStackLogger.log(
            new CallStackLogInfo(
                    "EmployeeDaoImpl",
                    "deleteEmployee",
                    String.valueOf(System.identityHashCode(this)),
                    "删除员工: "+String.valueOf(id)
            )
        );

        for (int i=0;i<this.employees.size();++i) {
            if (this.employees.get(i).getId() == id) {
                this.employees.remove(i);
                break;
            }
        }
    }

    /**
     * 增加游乐场的某个员工信息
     * @param name 需要增加的员工的姓名
     * @param salary 需要增加的员工的薪水
     * @return 新加入员工被分配的id
     */
    @Override
    public int addEmployee(String name, double salary) {
        CallStackLogger.log(
            new CallStackLogInfo(
                    "EmployeeDaoImpl",
                    "addEmployee",
                    String.valueOf(System.identityHashCode(this)),
                    "加入员工: "+String.valueOf(name) + " 薪水为: "+String.valueOf(salary)
            )
        );

        Employee newEmployee = new Employee(this.nextId++, name, salary);
        this.employees.add(newEmployee);
        return newEmployee.getId();
    }
}

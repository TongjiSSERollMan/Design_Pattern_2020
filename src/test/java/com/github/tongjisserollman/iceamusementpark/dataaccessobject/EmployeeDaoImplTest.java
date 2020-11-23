package com.github.tongjisserollman.iceamusementpark.dataaccessobject;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeDaoImplTest {
    @org.junit.jupiter.api.Test
    void daoTest(){
        EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
        int ciel_id = employeeDao.addEmployee("Ciel", 8000);
        assert (employeeDao.getAllEmployees().size() == 1);
        assert (employeeDao.getEmployee(ciel_id) != null);
        employeeDao.updateEmployee(ciel_id, 12000);
        assert (employeeDao.getEmployee(ciel_id).getSalary() == 12000);
        employeeDao.deleteEmployee(ciel_id);
        assert (employeeDao.getEmployee(ciel_id) == null);
        assert (employeeDao.getAllEmployees().size() == 0);
    }
}
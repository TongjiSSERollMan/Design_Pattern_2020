package com.github.tongjisserollman.iceamusementpark.dataaccessobject;

import static org.junit.jupiter.api.Assertions.*;

class DataAccessObjectTest {
    @org.junit.jupiter.api.Test
    void testDataAccessObject(){
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
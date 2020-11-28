package com.github.tongjisserollman.iceamusementpark.dataaccessobject;

import com.github.tongjisserollman.iceamusementpark.admin.employeeinfo.dataaccessobject.EmployeeDaoImpl;
import org.junit.jupiter.api.Test;

class DataAccessObjectTest {

    @Test
    void testDataAccessObject(){
        EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
        int cielId = employeeDao.addEmployee("Ciel", 8000);
        assert (employeeDao.getAllEmployees().size() == 1);
        assert (employeeDao.getEmployee(cielId) != null);
        employeeDao.updateEmployee(cielId, 12000);
        assert (employeeDao.getEmployee(cielId).getSalary() == 12000);
        employeeDao.deleteEmployee(cielId);
        assert (employeeDao.getEmployee(cielId) == null);
        assert (employeeDao.getAllEmployees().size() == 0);
    }
}
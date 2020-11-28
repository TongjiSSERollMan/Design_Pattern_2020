package com.github.tongjisserollman.iceamusementpark.office.employeecard.converter;

public class Converter {
    public EmployeeIdCard convertToIdCard(Employee person){
        return new EmployeeIdCard(
                person.id,
                person.name
        );
    }

    public Employee convertToEmployee(EmployeeIdCard card, String office, String home)
    {
        return new Employee(
                card.name,
                card.id,
                office,
                home
        );
    }
}

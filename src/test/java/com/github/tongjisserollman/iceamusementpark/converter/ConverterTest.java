package com.github.tongjisserollman.iceamusementpark.converter;

import com.github.tongjisserollman.iceamusementpark.admin.employeecard.converter.Converter;
import com.github.tongjisserollman.iceamusementpark.admin.employeecard.converter.Employee;
import com.github.tongjisserollman.iceamusementpark.admin.employeecard.converter.EmployeeIdCard;

import static org.junit.jupiter.api.Assertions.*;

public class ConverterTest {
    @org.junit.jupiter.api.Test
    void testConverter(){
        Employee person = new Employee(
                "Kowalski",
                "114514",
                "Building A, F1, Office 19",
                "Shanghai, Tongji University, Dorm 810"
        );

        Converter converter = new Converter();

        EmployeeIdCard card = converter.convertToIdCard(person);
        Employee samePerson = converter.convertToEmployee(
                card,
                "Building A, F1, Office 19",
                "Shanghai, Tongji University, Dorm 810"
        );

        card.inspect();
        samePerson.inspect();

        assertSame(card.id, person.id);
        assertSame(person.id, samePerson.id);
    }
}

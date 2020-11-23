package com.github.tongjisserollman.iceamusementpark.converter;

import static org.junit.jupiter.api.Assertions.*;

public class ConverterTest {
    @org.junit.jupiter.api.Test
    void converterTest(){
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

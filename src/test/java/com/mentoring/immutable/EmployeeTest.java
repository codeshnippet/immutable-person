package com.mentoring.immutable;

import static org.junit.Assert.*;

import org.apache.commons.lang3.SerializationUtils;
import org.junit.Test;


public class EmployeeTest {

    @Test
    public void testEmployeeIsImmutable(){
        // Given
        Employee one = new Employee();
        Employee two = SerializationUtils.clone(one);

        // When
        // Some code modifying object two.

        // Then
        assertEquals(one, two);
    }

}
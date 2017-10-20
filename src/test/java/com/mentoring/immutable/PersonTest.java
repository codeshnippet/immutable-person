package com.mentoring.immutable;

import static org.junit.Assert.*;

import org.apache.commons.lang3.SerializationUtils;
import org.junit.Test;


public class PersonTest {

    @Test
    public void testEmployeeIsImmutable(){
        // Given
        Person one = new Person();
        Person two = SerializationUtils.clone(one);

        // When
        // Some code modifying object two.

        // Then
        assertEquals(one, two);
    }

}
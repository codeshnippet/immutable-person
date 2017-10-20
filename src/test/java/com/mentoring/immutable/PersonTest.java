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
        // This block is for reviewer to test Person object immutability.
        // Whatever reviewer writes in this block should not break the test.
        //=======================================================================================
        //
        // example: two.setHeight(15);
        //
        //========================================================================================

        // Then
        assertEquals(one, two);
    }

}

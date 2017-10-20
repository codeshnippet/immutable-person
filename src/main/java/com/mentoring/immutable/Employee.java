package com.mentoring.immutable;

import java.io.Serializable;
import java.util.Date;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
class Person implements Serializable {
    public String name;
    private double height;
    private Date birthDate;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

}

@EqualsAndHashCode
public class Employee extends Person {
    private int salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

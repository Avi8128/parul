package com.parul7th;

public class StudentClass {

    String name;
    int roll;

    // Default constructor
    public StudentClass() {}

    // Parameterized constructor
    public StudentClass(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "StudentClass [name=" + name + ", roll=" + roll + "]";
    }
}

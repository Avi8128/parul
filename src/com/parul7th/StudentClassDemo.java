package com.parul7th;

public class StudentClassDemo {

    public static void main(String[] args) {
        // Use parameterized constructor
        StudentClass s1 = new StudentClass("RAVI", 0);
        StudentClass s2 = new StudentClass("SUMEET",12);
        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s2.name);
        System.out.println(s2.roll);
    }
}

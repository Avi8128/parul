package com.parul14th;

public class LoggerCustomizeImmutable {

    // Declare final field
    private final int a;

    // Constructor to initialize the final field
    public LoggerCustomizeImmutable(int a) {
        this.a = a;
    }

    // Getter method
    public int getA() {
        return this.a;
    }

    // main method to test
    public static void main(String[] args) {
        LoggerCustomizeImmutable obj = new LoggerCustomizeImmutable(42);
        System.out.println("Value of a: " + obj.getA());
    }
}

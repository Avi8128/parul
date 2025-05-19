package com.parul19th;

public class Addition {

    public static void main(String[] args) {
        Addition obj = new Addition();  // Create an object to call the method
        obj.addition();                 // Call the method
    }

    public void addition() {
        int sum = 0;  // Initialize sum to 0
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("Sum (1 to 10) :: " + sum);
    }
}

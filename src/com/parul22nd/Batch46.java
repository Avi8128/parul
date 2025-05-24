package com.parul22nd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Dept: " + department + ", Salary: " + salary;
    }
}

class EmployeeManager {
    static List<Employee> employees = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void start() {
        int choice;
        do {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Delete Employee by ID");
            System.out.println("3. Update Employee by ID");
            System.out.println("4. Display Total Number of Employees");
            System.out.println("5. Display All Employees");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1 -> addEmployee();
                case 2 -> deleteEmployeeById();
                case 3 -> updateEmployeeById();
                case 4 -> displayTotalEmployees();
                case 5 -> displayEmployees();
                case 6 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
    }

    static void addEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        employees.add(new Employee(id, name, dept, salary));
        System.out.println("✅ Employee added successfully.");
    }

    static void deleteEmployeeById() {
        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();
        boolean removed = employees.removeIf(e -> e.id == id);

        if (removed)
            System.out.println("🗑 Employee deleted successfully.");
        else
            System.out.println("❌ Employee not found.");
    }

    static void updateEmployeeById() {
        System.out.print("Enter Employee ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Employee e : employees) {
            if (e.id == id) {
                System.out.print("Enter new Name: ");
                e.name = sc.nextLine();

                System.out.print("Enter new Department: ");
                e.department = sc.nextLine();

                System.out.print("Enter new Salary: ");
                e.salary = sc.nextDouble();

                System.out.println("🔄 Employee details updated.");
                return;
            }
        }
        System.out.println("❌ Employee not found.");
    }

    static void displayTotalEmployees() {
        System.out.println("👥 Total number of employees: " + employees.size());
    }

    static void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("⚠ No employees in the list.");
        } else {
            System.out.println("📋 List of Employees:");
            for (Employee e : employees) {
                System.out.println(e);
            }
        }
    }
}

public class Batch46 {
    public static void main(String[] args) {
        EmployeeManager.start();
    }
}

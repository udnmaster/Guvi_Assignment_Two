package com.demo.assignmentTwo;

import java.util.Scanner;

class EmployeePerson {
    private String name;
    private int age;

    // Constructor for Person class
    public EmployeePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Employee extends EmployeePerson {
    private int employeeID;
    private double salary;

    // Constructor for Employee class
    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age); // Calling the constructor of the superclass (Person)
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Getters for employeeID and salary
    public int getEmployeeID() {
        return employeeID;
    }

    public double getSalary() {
        return salary;
    }
}

public class MainPerson {
    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	String name;
    	int age,employeeID;
    	double salary;
    	System.out.print("Enter employee name : ");
    	name=s.next();
    	System.out.print("Enter employee age : ");
    	age=s.nextInt();
    	System.out.print("Enter employee ID : ");
    	employeeID=s.nextInt();
    	System.out.print("Enter employee Salary : ");
    	salary=s.nextDouble();
        // Creating an Employee object
        Employee employee = new Employee(name, age, employeeID, salary);

        // Accessing attributes using getters
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Age: " + employee.getAge());
        System.out.println("Employee ID: " + employee.getEmployeeID());
        System.out.println("Employee Salary: $" + employee.getSalary());
    }
}

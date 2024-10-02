import java.util.Scanner;

// Superclass Employee
class Employee {
    protected String name;  // Employee name
    protected double salary; // Employee salary

    // Constructor for Employee
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass Programmer, inheriting from Employee
class Programmer extends Employee {
    private String proglanguage; // Programming language

    // Constructor for Programmer
    public Programmer(String name, double salary, String proglanguage) {
        super(name, salary); // Call to superclass constructor
        this.proglanguage = proglanguage;
    }

    // Overriding displayDetails to include programming language
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call superclass displayDetails
        System.out.println("Programming Language: " + proglanguage);
    }
}

// Main class to test the functionality
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        // Taking user input for the Employee details
        System.out.print("Enter the name of the programmer: ");
        String name = scanner.nextLine(); // Read the name

        System.out.print("Enter the salary of the programmer: ");
        double salary = scanner.nextDouble(); // Read the salary

        // Clear the buffer
        scanner.nextLine(); 

        System.out.print("Enter the programming language: ");
        String proglanguage = scanner.nextLine(); // Read the programming language

        // Create a Programmer object with user input
        Programmer programmer = new Programmer(name, salary, proglanguage);

        // Display the programmer's details
        programmer.displayDetails();

        // Close the scanner
        scanner.close();
    }
}


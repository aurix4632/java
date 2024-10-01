import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class s7q1 {
    public static void main(String[] args) {
        // Create a HashMap to store employee names and salaries
        HashMap<String, Double> employeeSalaryMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Accept the number of employees
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left-over

        // Accept employee details
        for (int i = 0; i < n; i++) {
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();
            System.out.print("Enter employee salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline left-over

            // Store the employee name and salary in the hash table
            employeeSalaryMap.put(name, salary);
        }

        // Display the details of the hash table
        System.out.println("\nEmployee Salary Details:");
        for (Map.Entry<String, Double> entry : employeeSalaryMap.entrySet()) {
            System.out.println("Employee Name: " + entry.getKey() + ", Salary: " + entry.getValue());
        }

        // Close the scanner
        scanner.close();
    }
}

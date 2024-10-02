import java.util.Scanner;

public class MaxNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        // Accept the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array to store the numbers
        int[] numbers = new int[n];

        // Accept the numbers from the user
        System.out.println("Enter " + n + " different numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt(); // Store each number in the array
        }

        // Find the maximum number in the array
        int maxNumber = numbers[0]; // Assume the first number is the maximum initially

        for (int i = 1; i < n; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i]; // Update maxNumber if current number is greater
            }
        }

        // Display the maximum number
        System.out.println("The maximum number is: " + maxNumber);

        // Close the scanner
        scanner.close();
    }
} 



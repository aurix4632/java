import java.util.Scanner;

public class s4q1 {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object to accept input from the user
        Scanner scanner = new Scanner(System.in);

        // Step 2: Prompt the user to enter their name
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        // Step 3: Convert the name to uppercase
        String upperCaseName = name.toUpperCase();

        // Step 4: Display the greeting message with the name in uppercase
        System.out.println("Hello, " + upperCaseName + ", nice to meet you!");

        // Close the scanner
        scanner.close();
    }
}


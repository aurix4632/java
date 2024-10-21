class ZeroNumberException extends Exception {
    public ZeroNumberException() {
        super("Number is 0");
    }
}

public class FactorialCalculator1 {
    public static long calculateFactorial(int number) {
        if (number == 0) {
            return 1; // Factorial of 0 is 1
        }
        
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        try {
            // Create a Scanner object to read user input
            java.util.Scanner scanner = new java.util.Scanner(System.in);

            // Prompt the user to enter a number
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number == 0) {
                throw new ZeroNumberException(); // Throw the custom exception for zero
            } else {
                // Calculate and display the factorial
                long factorial = calculateFactorial(number);
                System.out.println("Factorial of " + number + " is: " + factorial);
            }

            // Close the Scanner
            scanner.close();
        } catch (ZeroNumberException e) {
            System.err.println(e.getMessage()); // Handle the custom exception
        } catch (java.util.InputMismatchException e) {
            System.err.println("Invalid input. Please enter a valid number.");
        }
    }
}




import java.util.Scanner;

// User-defined exception class
class ZeroException extends Exception {
    public ZeroException(String msg) {
        super(msg);
    }
}

public class FactProgram {
    // Method to calculate factorial
    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ask user to input a number
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        
        try {
            // If the number is 0, throw user-defined exception
            if (num == 0) {
                throw new ZeroException("Number is 0");
            } else {
                // Calculate and display factorial
                int result = fact(num);
                System.out.println("Factorial of " + num + " is: " + result);
            }
        } catch (ZeroException e) {
            // Catch the custom exception and display its message
            System.out.println(e.getMessage());
        }
    }
}

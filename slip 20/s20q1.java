// run program
// javac CommandLineNumberSort1.java 
// java CommandLineNumberSort1 3 1 2


public class CommandLineNumberSort1 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java CommandLineNumberSort <number1> <number2> <number3>");
        } else {
            try {
                int num1 = Integer.parseInt(args[0]);
                int num2 = Integer.parseInt(args[1]);
                int num3 = Integer.parseInt(args[2]);

                int temp;

                // Sort the numbers using a simple bubble sort algorithm
                if (num1 > num2) {
                    temp = num1;
                    num1 = num2;
                    num2 = temp;
                }
                if (num2 > num3) {
                    temp = num2;
                    num2 = num3;
                    num3 = temp;
                }
                if (num1 > num2) {
                    temp = num1;
                    num1 = num2;
                    num2 = temp;
                }

                System.out.println("Sorted numbers: " + num1 + " " + num2 + " " + num3);
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid integer numbers as command-line arguments.");
            }
        }
    }
} 

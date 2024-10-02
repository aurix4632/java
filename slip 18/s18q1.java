public class FactorPrinter1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FactorPrinter <number>");
        } else {
            try {
                int number = Integer.parseInt(args[0]);
                if (number < 1) {
                    System.out.println("Please enter a positive integer.");
                } else {
                    System.out.print("Factors of " + number + ": ");
                    for (int i = 1; i <= number; i++) {
                        if (number % i == 0) {
                            System.out.print(i + " ");
                        }
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer as a command-line argument.");
            }
        }
    }
}

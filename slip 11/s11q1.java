import java.util.Scanner;

// MyDate class definition
class MyDate {
    private int dd; // Day
    private int mm; // Month
    private int yy; // Year

    // Parameterized constructor
    public MyDate(int dd, int mm, int yy) {
        this.dd = dd; // Using this keyword to refer to the instance variable
        this.mm = mm; // Using this keyword to refer to the instance variable
        this.yy = yy; // Using this keyword to refer to the instance variable
    }

    // Method to display the date in dd-mm-yy format
    public void displayDate() {
        System.out.printf("Date: %02d-%02d-%02d%n", dd, mm, yy);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for date input
        System.out.print("Enter day (dd): ");
        int day = scanner.nextInt();

        System.out.print("Enter month (mm): ");
        int month = scanner.nextInt();

        System.out.print("Enter year (yy): ");
        int year = scanner.nextInt();

        // Create an instance of MyDate using the user input
        MyDate date = new MyDate(day, month, year);
        
        // Display the date
        date.displayDate();
        
        // Close the scanner
        scanner.close();
    }
}


import java.util.Scanner;

// User-defined exception class for invalid dates
class InvalidDateException extends Exception {
    public InvalidDateException(String message) {
        super(message);
    }
}

// MyDate class to represent a date
class MyDate {
    private int day;
    private int month;
    private int year;

    // Method to accept date input
    public void acceptDate() throws InvalidDateException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date as dd mm yyyy: ");
        day = scanner.nextInt();
        month = scanner.nextInt();
        year = scanner.nextInt();

        // Validate the date
        if (!isValidDate(day, month, year)) {
            throw new InvalidDateException("Invalid Date: " + day + "/" + month + "/" + year);
        }
    }

    // Method to check if the date is valid
    private boolean isValidDate(int day, int month, int year) {
        if (month < 1 || month > 12) return false; // Month must be between 1 and 12

        // Days in month
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Check for leap year for February
        if (month == 2 && isLeapYear(year)) {
            daysInMonth[2] = 29;
        }

        return day > 0 && day <= daysInMonth[month]; // Day must be valid for the month
    }

    // Method to check if a year is a leap year
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to display the date
    public void displayDate() {
        System.out.printf("Date: %02d/%02d/%04d%n", day, month, year);
    }
}
public class s8q2 {
    public static void main(String[] args) {
        MyDate date = new MyDate();

        try {
            date.acceptDate(); // Accept the date input
            date.displayDate(); // Display the valid date
        } catch (InvalidDateException e) {
            System.out.println(e.getMessage()); // Print the exception message
        }
    }
}

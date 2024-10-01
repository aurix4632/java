
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UniqueSortedCollection1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers (n): ");
        int n = scanner.nextInt();

        Set<Integer> uniqueSortedSet = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();
            uniqueSortedSet.add(num);
        }

        System.out.println("Unique integers in sorted order:");
        for (int num : uniqueSortedSet) {
            System.out.print(num + " ");
        }

        System.out.println(); // Newline for readability

        System.out.print("Enter an integer to search: ");
        int searchNum = scanner.nextInt();

        if (uniqueSortedSet.contains(searchNum)) {
            System.out.println(searchNum + " is found in the collection.");
        } else {
            System.out.println(searchNum + " is not found in the collection.");
        }
    }
}


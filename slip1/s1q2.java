import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class ColorList {
    public static void main(String[] args) {
        // Step 1: Create a LinkedList with colors
        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add("orange");

        // Step 2: Display the contents of the list using an Iterator
        System.out.println("Displaying the contents of the list using Iterator:");
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Step 3: Display the contents of the list in reverse order using a ListIterator
        System.out.println("\nDisplaying the contents of the list in reverse order using ListIterator:");
        ListIterator<String> listIterator = colors.listIterator(colors.size()); // Start at the end of the list
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // Step 4: Create another list with "pink" and "green"
        LinkedList<String> newColors = new LinkedList<>();
        newColors.add("pink");
        newColors.add("green");

        // Step 5: Insert new colors between "blue" and "yellow"
        int indexOfYellow = colors.indexOf("yellow"); // Find the index of "yellow"
        colors.addAll(indexOfYellow, newColors); // Insert new colors before "yellow"

        // Step 6: Display the modified list
        System.out.println("\nModified list after inserting 'pink' and 'green' between 'blue' and 'yellow':");
        for (String color : colors) {
            System.out.println(color);
        }
    }
} 


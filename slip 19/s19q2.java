import java.util.Scanner;

// Abstract class Order
abstract class Order {
    protected int id;
    protected String description;

    public abstract void accept();
    public abstract void display();
}

// Subclass PurchaseOrder
class PurchaseOrder extends Order {
    private String customerName;

    @Override
    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Order ID: ");
        id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Order Description: ");
        description = scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        customerName = scanner.nextLine();
    }

    @Override
    public void display() {
        System.out.println("Order ID: " + id + ", Description: " + description + ", Customer: " + customerName);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        PurchaseOrder[] orders = new PurchaseOrder[3];
        for (int i = 0; i < 3; i++) {
            orders[i] = new PurchaseOrder();
            System.out.println("\n--- Enter details for Purchase Order " + (i + 1) + " ---");
            orders[i].accept();
        }
        
        System.out.println("\n--- Purchase Orders ---");
        for (PurchaseOrder order : orders) {
            order.display();
        }
    }
}


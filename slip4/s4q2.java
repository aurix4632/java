import java.util.Scanner;

class Product {
    int id;
    String name;
    double price;

    // Constructor to initialize Product object
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class s4q2 {
    public static void main(String[] args) {
        // Create an array to store 5 Product objects
        Product[] products = new Product[5];
        // Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Step 1: Accept information for 5 products
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("Enter product id: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline character after integer input
            System.out.print("Enter product name: ");
            String name = scanner.nextLine();
            System.out.print("Enter product price: ");
            double price = scanner.nextDouble();

            // Create and store the product object in the array
            products[i] = new Product(id, name, price);
        }

        // Step 2: Find the product with the minimum price
        Product minPriceProduct = products[0]; // Assume the first product has the minimum price initially
        for (int i = 1; i < products.length; i++) {
            if (products[i].price < minPriceProduct.price) {
                minPriceProduct = products[i]; // Update minPriceProduct if a lower price is found
            }
        }

        // Step 3: Display the name of the product with the minimum price
        System.out.println("\nThe product with the minimum price is: " + minPriceProduct.name);

        // Close the scanner
        scanner.close();
    }
}


// Superclass Point
class Point {
    int x, y;

    // Default constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to display point details
    public void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }
}

// Subclass ColorPoint
class ColorPoint extends Point {
    String color;

    // Default constructor
    public ColorPoint() {
        super(); // Call superclass default constructor
        this.color = "unknown";
    }
// Parameterized constructor
public ColorPoint(int x, int y, String color) {
    super(x, y); // Call superclass parameterized constructor
    this.color = color;
}

// Override the display method to include color information
@Override
public void display() {
    System.out.println("ColorPoint coordinates: (" + x + ", " + y + "), Color: " + color);
}
}

public class s5q2 {
public static void main(String[] args) {
    // Creating Point object using default constructor
    Point p1 = new Point();
    p1.display();

    // Creating Point object using parameterized constructor
    Point p2 = new Point(5, 10);
    p2.display();

    // Creating ColorPoint object using default constructor
    ColorPoint cp1 = new ColorPoint();
    cp1.display();

    // Creating ColorPoint object using parameterized constructor
    ColorPoint cp2 = new ColorPoint(7, 14, "Red");
    cp2.display();
}
}

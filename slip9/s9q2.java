// Superclass Point
class Point {
    protected int x;
    protected int y;

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

// Subclass Point3D
class Point3D extends Point {
    private int z;

    // Default constructor
    public Point3D() {
        super(); // Call superclass default constructor
        this.z = 0;
    }

    // Parameterized constructor
    public Point3D(int x, int y, int z) {
        super(x, y); // Call superclass parameterized constructor
        this.z = z;
    }

    // Override the display method to include z coordinate
    @Override
    public void display() {
        System.out.println("Point3D coordinates: (" + x + ", " + y + ", " + z + ")");
    }
}

public class s9q2 {
    public static void main(String[] args) {
        // Creating a Point object using default constructor
        Point p1 = new Point();
        p1.display();

        // Creating a Point object using parameterized constructor
        Point p2 = new Point(5, 10);
        p2.display();

        // Creating a Point3D object using default constructor
        Point3D p3d1 = new Point3D();
        p3d1.display();

        // Creating a Point3D object using parameterized constructor
        Point3D p3d2 = new Point3D(7, 14, 21);
        p3d2.display();
    }
}

public class Employee2 {
    private int id;
    private String name;
    private String deptName;
    private double salary;
    private static int objectCount = 0;

    public Employee2() {
        // Default constructor
        this.id = 0;
        this.name = "Unknown";
        this.deptName = "Unknown";
        this.salary = 0.0;
        objectCount++;
    }

    public Employee2(int id, String name, String deptName, double salary) {
        // Parameterized constructor using 'this' keyword
        this.id = id;
        this.name = name;
        this.deptName = deptName;
        this.salary = salary;
        objectCount++;
    }

    public void display() {
        System.out.println("Employee2 ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + deptName);
        System.out.println("Salary: " + salary);
    }

    public static int getObjectCount() {
        return objectCount;
    }

    public static void main(String[] args) {
        Employee2 emp1 = new Employee2(101, "saurabh", "HR", 45000.0);
        System.out.println("Object Count: " + getObjectCount());
        emp1.display();
        System.out.println();

        Employee2 emp2 = new Employee2(102, "yogesh ", "IT", 55000.0);
        System.out.println("Object Count: " + getObjectCount());
        emp2.display();
    }
}

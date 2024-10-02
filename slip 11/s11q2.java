
abstract class Shape 
{
    public abstract void area();
    public abstract void volume();
}

class Sphere extends Shape 
{
    double r;
    Sphere(double radius) 
    {
        r = radius;
    }

    public void area() 
    {
        double a = 4 * 3.14 * r * r;
        System.out.println("Area of Sphere: " + a);
    }

    public void volume() 
    {
        double v = (4.0 / 3.0) * 3.14 * r * r * r;
        System.out.println("Volume of Sphere: " + v);
    }
}

class s11q2 
{
    public static void main(String[] args) 
    {
        Sphere s = new Sphere(5);
        s.area();
        s.volume();
    }
}

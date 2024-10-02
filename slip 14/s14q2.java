import java.util.Scanner;
interface operation
{
    abstract void area();
    abstract void volume();
    final double pi=3.14;
}

class cylinder implements operation
{
    double r;
    double h;
    cylinder(double radius, double height)
    {
        r=radius;
        h=height;
    }
    
    public void area()
    {
        double a=2*pi*r*h+2*pi*r*r;
        System.out.println("Area of cylinder : "+a);
    }
    
    public void volume()
    {
        double v=pi*r*r*h;
        System.out.println("Volume of cylinder : "+v);
    }
}

class s14q2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius and height : ");
        double a=sc.nextDouble();
        double v=sc.nextDouble();
        cylinder c=new cylinder(a,v);
        c.area();
        c.volume();
    }
}



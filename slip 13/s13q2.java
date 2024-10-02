import java.util.Scanner;
interface operation
{
    abstract void area();
    abstract void volume();
    final double pi=3.14;
}

class circle implements operation
{
    double r;
    double h;
    circle(double radius, double height)
    {
        r=radius;
        h=height;
    }
    
    public void area()
    {
        double a=pi*r*r;
        System.out.println("Area of circle : "+a);
    }
    
    public void volume()
    {
        double v=pi*r*r*h;
        System.out.println("Volume of circle : "+v);
    }
}

class s13q2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius and height : ");
        double a=sc.nextDouble();
        double v=sc.nextDouble();
        circle c=new circle(a,v);
        c.area();
        c.volume();
    }
}



abstract class Shape
{
public abstract void area();
public abstract void volume();
}

class Cylinder extends Shape
{
double radius,height;
Cylinder(double radius,double height)
{
this.radius=radius;
this.height=height;
}

public void area()
{
double a=2*3.14*radius*height+2*3.14*radius*radius;
System.out.println("Area of Cylinder : "+a);
}

public void volume()
{
double v=3.14*radius*radius*height;
System.out.println("Volume of Cylinder : "+v);
}
}

class s12q2
{
public static void main(String[] args)
{
Cylinder c=new Cylinder(5.5,1.2);
c.area();
c.volume();
}
}

import java.util.Scanner;
class employee
{
    String name;
    double salary;
    
    employee(String n,double s)
    {
        name=n;
        salary=s;
    }
    
    public void displayEmp()
    {
        System.out.println("name : "+name);
        System.out.println("salary : "+salary);
    }
}

class developer extends employee 
{
    String pname;
    public developer(String n1,double s1,String p1)
    {
        super(n1,s1);
        pname=p1;
    }
    
    void displayProj()
    {
        System.out.println("project name : "+pname);
    }
}

public class s15q2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name : ");    
        String name1=sc.next();
        System.out.print("Enter salary : ");    
        double salary1=sc.nextDouble();
        System.out.print("Enter project name : ");    
        String pname1=sc.next();
        developer d=new developer(name1,salary1,pname1);
        d.displayEmp();
        d.displayProj();
    }
}

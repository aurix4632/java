import java.io.*;
class Employee
{
    String name;
    int salary;
    Employee(String nm,int sal)
    {
        name=nm;
        salary=sal;
    }
    void show()
    {
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
    }
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String n;
        int s,i;
        
        Employee e[]=new Employee[3];
        int sal[]=new int[3];
        
        for(i=0;i<3;i++)
        {
            System.out.print("Enter Employee name : ");
            n=br.readLine();
            System.out.print("Enter Employee salary : ");
            s=Integer.parseInt(br.readLine());
            e[i]=new Employee(n,s);
            sal[i]=e[i].salary;
        }
        
        System.out.print("Employee details are as follows : ");
        for(i=0;i<3;i++)
        {
            e[i].show();
        }
        int max=sal[0];
        int arr[]=new int[3];
        int j=0;
        for(i=0;i<3;i++)
        {
            if(max>sal[i])
            {
                max=max;
            }
            else
            {
                max=sal[i];
            }
        }
        System.out.println("Maximum salary is : "+max);
    }
}


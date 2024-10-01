import java.util.Scanner;
class Student
{
int rno;
String name;
double per;

public Student()
{
this.rno=1;
this.name="Jidnyasa";
this.per=80.50;
}

public Student(int rno, String name, double per)
{
this.rno=rno;
this.name=name;
this.per=per;
}

void display()
{
System.out.println(rno+" "+name+" "+per)
}

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter how many students : ");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
System.out.println("Enter student rollno : ");
int srno=sc.nextInt();
System.out.println("Enter student name : ");
String sname=sc.next();
System.out.println("Enter student percentage : ");
double sper=sc.nextDouble();
Student s=new Student(srno,sname,sper);
s.display();
}
}
}


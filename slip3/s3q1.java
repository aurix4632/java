import java.util.Scanner;
public class s3q1
{
int sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of array elements : ");
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<a.length;i++)
{
sum=sum+a[i];
}
System.out.println("Sum of array elements :"+sum);
}
}

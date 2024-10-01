import java.util.Scanner;
public class s1q1
{
public static void main(String[] args)
{
int ans;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number : ");
int n=sc.nextInt();
for(int i=1;i<=10;i++)
{
ans=n*i;
System.out.println(ans);
}
}
}

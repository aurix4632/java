import java.util.Scanner;
class s8q1
{
public static void main(String[] args)
{
int n=Integer.parseInt(args[0]);
while(n>0)
{
int k=n%10;
System.out.print(k); 
n=n/10;
}
}

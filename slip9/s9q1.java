import java.io.*;
class s9q1
{
public static void main(String[] args)
{
int sum=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number : ");
int n=Integer.parseInt(br.readLine());
for(int i=0;i<n;i++)
{
if(n%i==0)
sum=sum+i;
}
if(sum==n)
System.out.println("Number is perfect");
else
System.out.println("Number is not perfect");
}
}

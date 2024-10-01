class MyNumber
{
int n;
public MyNumber()
{
n=0;
}

public MyNumber(int x)
{
n=x;
}

public void isNegative()
{
if(n<0)
System.out.println("Number is negative");
}

public void isPositive()
{
if(n>=0)
System.out.println("Number is positive");
}

public void isOdd()
{
if(n%2!=0)
System.out.println("Number is odd");
}

public void isEven()
{
if(n%2==0)
System.out.println("Number is even");
}

class s2q2
{
public static void main(String[] args)
{
int n1=Integer.parseInt(args[0]);
System.out.println(n1);
MyNumber m1=new MyNumber(n1);
m1.isNegative();
m1.isPositive();
m1.isOdd();
m1.isEven();
}
}
}


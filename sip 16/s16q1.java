class MyNumber
{
int a;
MyNumber(int x)
{
a=x;
}

void isEven()
{
if(a%2==0)
System.out.println("Number is even");
}

public static void main(String[] args)
{
int n=Integer.parseInt(args[0]);
MyNumber m1=new MyNumber(n);
m1.isEven();
}
}

Command on terminal – 

javac MyNumber.java
java MyNumber 3



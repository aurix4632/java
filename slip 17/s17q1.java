class MyNumber
{
int a;
MyNumber(int x)
{
a=x;
}

void isOdd()
{
if(a%2!=0)
System.out.println("Number is odd");
}

public static void main(String[] args)
{
int n=Integer.parseInt(args[0]);
MyNumber m1=new MyNumber(n);
m1.isOdd();
}
}

Command on terminal –

javac MyNumber.java
java MyNumber 4



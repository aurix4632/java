import java.util.Scanner;
public class que3{
    public static void main(String[] args){
    int sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of array element");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the elements");
    for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
    }
    for(int i=0;i<a.length;i++){
        sum+=+a[i];
    }
    System.out.println("sum of array elements"+sum);
}
}

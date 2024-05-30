import java.util.Scanner;
class scanner
{
public static void main(String arg[]) 
{
System.out.print("Input 1st integer:");
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
System.out.print("Input 2nd  integer:");
int n2=sc.nextInt();
int sum=n1+n2;
int difference=n1-n2;
int product=n1*n2;
double average=(double)(n1+n2)/2;
int distance=Math.abs(n1-n2);
final int maximum=Math.max(n1,n2);
int minimum=Math.min(n1,n2);
System.out.println("Sum:"+sum);
System.out.println("Difference:"+difference);
System.out.println("Product:"+product);
System.out.println("Average:"+average);
System.out.println("Distance:"+distance);
System.out.println("Maximum:"+maximum);
System.out.println("Minimum:"+minimum);
}
}
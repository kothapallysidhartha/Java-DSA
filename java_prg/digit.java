import java.util.Scanner;
class digit
{
public static void main(String arg[])
{
System.out.print("Input six non-negative digits:");
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
int n1 =number/100000%10;
int n2=number/10000%10;
int n3=number/1000%10;
int n4=number/100%10;
int n5=number/10%10;
int n6=number%10;
System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6);
}
}
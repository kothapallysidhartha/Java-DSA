import java.util.Scanner;
public class naturalsum {
    public static void main(String arg[])
    {
        int x=0,sum=0;
        System.out.println("Enter the natural number N:");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        int i=x;
        while(x!=0)
        {
            sum=sum+x;
            x--;
        }
        System.out.println("Sum of first "+i+" Natural numbers is:"+sum);
    }
}

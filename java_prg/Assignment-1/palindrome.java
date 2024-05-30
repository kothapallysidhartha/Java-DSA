import java.util.Scanner;
public class palindrome {
    public static void main(String arg[])
    {
        int x,r=0,t;
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        t=x;
        while(t!=0)
        {
            r=(r*10)+t%10;
            t=t/10;
        }
        if(r==x)
        System.out.println(x+" is a palindrome number");
        else
        System.out.println(x+" is not a palindrome number");
    }
}

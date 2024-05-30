import java.util.Scanner;
public class armstrong {
    public static void main(String arg[])
    {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        x=sc.nextInt();
        String c=String.valueOf(x);
        int le=c.length();
        int rev=0,t;
        t=x;
        do{
            int digit = t % 10;
            rev += Math.pow(digit, le);
            t /= 10;
        }while(t!=0);
        if(rev==x)
        System.out.println(x+" is a armstrong number");
        else
        System.out.println(x+" is not a armstrong number");
    }
}

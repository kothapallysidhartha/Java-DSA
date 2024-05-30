import java.util.Scanner;
public class reverse {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int x=sc.nextInt();
        int t=0;
        do{
            t=(t*10)+x%10;
            x=x/10;
        }while(x!=0);
        System.out.println("Reverse number is:"+t);
    }
}

import java.util.Scanner;
class Prog1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of characters:");
        int noOfChars=sc.nextInt();
        System.out.println("Enter no.of Assistants:");
        int noOfAssts=sc.nextInt();
        int charPerAssts=noOfChars/noOfAssts;
        System.out.println("Script Division");
        for(int i=1;i<=noOfAssts;i++){
            int startChar=(i-1)*charPerAssts+1;
            int endChar=i*charPerAssts;
            System.out.println("Assistant "+i+" startcharacter: "+startChar+" endChar: "+endChar);
        }
    }
}

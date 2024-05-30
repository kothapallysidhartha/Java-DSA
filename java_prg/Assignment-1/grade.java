import java.util.Scanner;
public class grade {
    public static void main(String arg[])
    {
        float s1,s2,s3,s4,total,average;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of subject-1:");
        s1=sc.nextFloat();
        System.out.println("Enter marks of subject-2:");
        s2=sc.nextFloat();
        System.out.println("Enter marks of subject-3:");
        s3=sc.nextFloat();
        System.out.println("Enter marks of subject-4:");
        s4=sc.nextFloat();
        total=s1+s2+s3+s4;
        average=total/4;
        System.out.println("PASS-40% marks in each subject and 45% of marks in overall");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        if((s1>=40 && s2>=40 && s3>=40 && s4>=40) && total>=180){
            System.out.println("PASS");
        int grade = (int) average / 10;

        switch (grade) {
            //case 10:
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: E");
                break;
        }
        }
        else
        {
            System.out.println("FAIL");
        }

    }

    
}

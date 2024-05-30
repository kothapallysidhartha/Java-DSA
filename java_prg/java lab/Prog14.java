import java.util.Scanner;
class Prog14{
	public static void performDivision(int numerator,int denominator){
		try{
			double result=numerator/denominator;
			System.out.println("Result= "+result);
			
		}catch(ArithmeticException e){
			System.out.println("Division with zero is not allowed");
		}catch(Exception e){
			System.out.println("Exception: "+e);
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("Enter numerator: ");
			int numerator=sc.nextInt();
			System.out.println("Enter denominator: ");
			int denominator=sc.nextInt();
			performDivision(numerator,denominator);
		}catch(Exception e){
			System.out.println("Error: "+e);
		}
		finally{
			System.out.println("Program Terminated");
			sc.close();
		}
	}
}

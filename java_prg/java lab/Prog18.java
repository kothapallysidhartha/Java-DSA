import java.util.Scanner;
class Prog18{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Alphabets:");
		String input=sc.nextLine().toUpperCase();
		
		boolean isInAlphabeticalOrder=checkAlphabetOrder(input);
		if(isInAlphabeticalOrder){
			System.out.println("Pass! in alphabetical order");
		}else{
			System.out.println("Fail! not in alphabetical order");
		}
	}
	public static boolean checkAlphabetOrder(String input){
		for(int i=0;i<input.length()-1;i++){
			char currentChar=input.charAt(i);
			char nextChar=input.charAt(i+1);
			if(currentChar>nextChar){
				return false;
			}
		}
		return true;
	}
}

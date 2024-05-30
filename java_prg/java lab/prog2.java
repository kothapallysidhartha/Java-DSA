import java.util.Scanner;

class Prog2{
	//Display The Arrangement
	public static void displayArrangement(String arrangement[][],int rows,int candPerRow){
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<candPerRow;j++){
				System.out.print(arrangement[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	//Rearrangement 
	public static void reArrangement(String arrangement[][],int rows,int candPerRow){
		
		String reArrange[][]=new String[rows][candPerRow];
		for(int i=0;i<rows;i++){
			for(int j=0;j<candPerRow;j++){
				reArrange[i][j]=arrangement[j][i];
			}
		}
		displayArrangement(reArrange,rows,candPerRow);
	}
	
	//Main Method
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of rows: ");
		int rows=sc.nextInt();
		System.out.println("Enter no.of students per row: ");
		int candPerRow=sc.nextInt();
		
		String originalArrangement[][]=new String[rows][candPerRow];
		for(int i=0;i<rows;i++){
			for(int j=0;j<candPerRow;j++){
				
				originalArrangement[i][j]=sc.next();
				
			}

		}
		displayArrangement(originalArrangement,rows,candPerRow);
		reArrangement(originalArrangement,rows,candPerRow);
	}
}

import java.util.Scanner;
class Amazon{
	public Amazon(String userName){
		System.out.println("Amazon User: "+userName);
	}
	
	public void buyTShirt(){
		System.out.println("TShirt added to shopping cart");
	}
	
	public void buyShoe(int qty1){
		System.out.println("Shoes "+qty1+" pairs added to shopping cart");
	}
	
	public void buySunglasses(int qty2,int price){
		System.out.println("Glasses  pairs added to shopping cart");
	}
}

class Prog5{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Amazon am=new Amazon("Sidhartha");
		am.buyTShirt();
		System.out.println("Enter the no.of pairs of Shoe: ");
		int qty1=sc.nextInt();
		am.buyShoe(qty1);
		System.out.println("Enter the no.of pairs sunglasses: ");
		int qty2=sc.nextInt();
		System.out.println("Enter the price of sunglass: ");
		int price=sc.nextInt();
		am.buySunglasses(qty2,price);
	}
}

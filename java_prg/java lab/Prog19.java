import java.util.*;

interface Shape{
	Scanner sc=new Scanner(System.in);
	public void getData();
	public void display();

}

class Rectangle implements Shape{
	double length,breadth;
	double result;
	public void getData(){
		length=Double.parseDouble(sc.nextLine());
		breadth=Double.parseDouble(sc.nextLine());
	}
	public void display(){
		result=length*breadth;
		System.out.println("Area of Rectangle is "+result);
	}
}

class Circle implements Shape{
	double side;
	double result;
	public void getData(){
		side=Double.parseDouble(sc.nextLine());
	}
	public void display(){
		result=3.14*side*side;
		System.out.println("Area of circle= "+result);
	}
}

class Prog19{
	public static void main(String args[]){
		Circle c1=new Circle();
		c1.getData();
		c1.display();
		Rectangle r1=new Rectangle();
		r1.getData();
		r1.display();
	}
}

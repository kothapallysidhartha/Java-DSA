abstract class Marks{
	public abstract void getAverage();
}

class A extends Marks{
	public int sub1,sub2,sub3;
	public A(int s1,int s2,int s3){
		this.sub1=s1;
		this.sub2=s2;
		this.sub3=s3;
	}
	
	public void getAverage(){
		System.out.println((sub1+sub2+sub3)/3.0);
	}
}

class B extends Marks{
	public int sub1,sub2,sub3,sub4;
	public B(int s1,int s2,int s3,int s4){
		this.sub1=s1;
		this.sub2=s2;
		this.sub3=s3;
		this.sub4=s4;
	}
	public void getAverage(){
		System.out.println((sub1+sub2+sub3+sub4)/4.0);
	}
}

class Prog17{
	public static void main(String args[]){
		A stdA=new A(45,75,89);
		B stdB=new B(89,47,78,98);
		stdA.getAverage();
		stdB.getAverage();
	}
}

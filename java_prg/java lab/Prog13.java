class UserThread implements Runnable{
	String tname;
	Thread t;
	public UserThread(String tname){
		t=new Thread(this,tname);
		this.tname=tname;
		System.out.println("Child Thread created: "+t);
		t.start();
	}
	
	public void run(){
		try{
			for(int i=1;i<=5;i++){
				System.out.println("\n"+t+":"+i);
				Thread.sleep(2000);
			}
		}catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}
class Prog13{
	public static void main(String args[]){
		System.out.println("Main Thread started...");
		UserThread t1=new UserThread("A");
		UserThread t2=new UserThread("B");
		try{
			System.out.println("Main Thread Suspending");
			Thread.sleep(20000);
			System.out.println("Main Thread resumed");
		}catch(Exception e){
			System.out.println("Error: "+e);
		}
		System.out.println("Main terminating");
	}
}

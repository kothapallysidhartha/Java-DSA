class MultiThreaded2 extends Thread{
public static void main(String[] args) throws InterruptedException{
MultiThreaded2 obj = new MultiThreaded2();
obj.start();
for(int j=1 ; j<=10 ; j++){
System.out.println("j : "+j);
Thread.sleep(500);
}
System.out.println("main exiting...");
}
public void run() // throws InterruptedException
{
for(int i=1 ; i<=10 ; i++){
System.out.println("i : "+i);
try{
Thread.sleep(1000);
}
catch (InterruptedException ie){ }
}
System.out.println("Child exiting...");
}
}

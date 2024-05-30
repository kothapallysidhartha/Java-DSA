import java.util.*;

class Professor{
	
	public ArrayList<String>studentsWaiting;
	
	public Professor(){
		studentsWaiting=new ArrayList<String>();
	}
	
	public void gatherBeforeLecture(){
		System.out.println("Students are already gathered for the lecture.");
	}
	
	public void latecomerAsksPermission(String stdName){
		System.out.println(stdName+" asks for permission to enter the hall");
		studentsWaiting.add(stdName);
		System.out.println(stdName+" is added to waiting list");
	}
	
	public void grantPermissionToEnter(){
		System.out.println("Professor grants permission for all waiting students.");
		Iterator<String> iterator=studentsWaiting.iterator();
		while(iterator.hasNext()){
			String studentName=iterator.next();
			System.out.println(studentName+" enters the hall");
			System.out.println(studentName+" removed from waiting list");
			iterator.remove();
			
		}
	}
	
	public void handleAnonymousStudent(String anonymousStudent){
		System.out.println("An Anonymous student entered the class");
		System.out.println("Professor asks the anonymous student to leave the class");
		System.out.println(anonymousStudent+" is sent out of the hall");
	}
}

class Prog16{
	public static void main(String args[]){
	
	Professor prof=new Professor();
	
	prof.gatherBeforeLecture();
	
	prof.latecomerAsksPermission("Latercomer1");
	prof.latecomerAsksPermission("Latercomer2");
	prof.latecomerAsksPermission("Latercomer3");
	
	prof.grantPermissionToEnter();
	
	prof.handleAnonymousStudent("AnonymousStudent");
	}
}

class Prog3{
	public int eid;
	public String ename;
	public int salary;
	
	public Prog3(int eid,String ename,int salary){
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
	}
	public void employeeDetails(){
		System.out.println("Employee ID: "+eid);
		System.out.println("Employee Name: "+ename);
		System.out.println("Employee Salary: "+salary);
	}
	public static void main(String args[]){
		Prog3 emp1=new Prog3(101,"KiranKumar",25000);
		
		Prog3 emp2=new Prog3(102,"Ashok",28000);
		
		emp1.employeeDetails();
		System.out.println();
		emp2.employeeDetails();
		
	}
}

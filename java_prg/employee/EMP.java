/*1.Write a java program to perform employee payroll procession using package in the java file.
EMP.JAVA create a package employee and create a class emp.Declare the variables name, empid,
category,bpay,hra,da,npay,pf,grosspay,incometax,and allowance.Calculate the values in methods,
create another java file Emppay.java.create an object e to call the methods to perform and print values.

2.WAP to implement calculator using packages.

3.WAP to calculate Simple interest using packages.

4.WAP to calculate grade of student using packages.Calculate total,avg,result and grade in 
package and display result in main method.*/
package employee;
public class EMP {
    String name;
    int empid;
    String category;
    double bpay;
    double hra;
    double da;
    double npay;
    double pf;
    double grosspay;
    double incometax;
    double allowance;

    // Constructor
    public EMP(String name, int empid, String category, double bpay, double hra, double da, double allowance) {
        this.name = name;
        this.empid = empid;
        this.category = category;
        this.bpay = bpay;
        this.hra = hra;
        this.da = da;
        this.allowance = allowance;
    }
    public void calculateGrossPay() {
        grosspay = bpay + hra + da + allowance;
    }             
    public void calculateNetPay() {
        pf = 0.12 * bpay; // Assuming PF is 12% of Basic Pay
        incometax = 0.10 * grosspay; // Assuming Income Tax is 10% of Gross Pay
        npay = grosspay - (pf + incometax);
    }
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Basic Pay: " + bpay);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Allowance: " + allowance);
        System.out.println("Gross Pay: " + grosspay);
        System.out.println("PF: " + pf);
        System.out.println("Income: " + incometax);
        System.out.println("Net Pay: " + npay);
    }
}


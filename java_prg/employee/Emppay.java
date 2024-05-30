import employee.EMP;


public class Emppay {
    public static void main(String[] args) {
        EMP e = new EMP("abc", 1012, "Regular/Intern", 50000.0, 15000.0, 10000.0, 5000.0);

        e.calculateGrossPay();
        e.calculateNetPay();
        e.displayEmployeeDetails();
    }
}
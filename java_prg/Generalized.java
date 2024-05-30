import java.util.Scanner;

// Generalized class
class Generalized {
    int z;

    // Method for addition
    void addition(int x, int y) {
        z = x + y;
        System.out.println("Addition Result: " + z);
    }

    // Method for subtraction
    void subtraction(int x, int y) {
        z = x - y;
        System.out.println("Subtraction Result: " + z);
    }
}

// Specialized class inheriting from Generalized
class Specialized extends Generalized {
    // Method for multiplication of {(x+y)*(x-y)}
    void multiplication(int x, int y) {
        z = (x + y) * (x - y);
        System.out.println("Multiplication Result: " + z);
    }
}

// Inheritance class with the main method
public class Inheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user inputs
        System.out.print("Enter an integer x: ");
        int x = scanner.nextInt();
        System.out.print("Enter an integer y: ");
        int y = scanner.nextInt();

        // Create an object of the Specialized class
        Specialized specializedObj = new Specialized();

        // Call methods of Generalized class
        specializedObj.addition(x, y);
        specializedObj.subtraction(x, y);

        // Call method of Specialized class
        specializedObj.multiplication(x, y);

        // Close the scanner
        scanner.close();
    }
}
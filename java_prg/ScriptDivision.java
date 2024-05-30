import java.util.Scanner;

public class ScriptDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the script from the user
        System.out.println("Enter the script: ");
        String script = scanner.nextLine();

        // Get the number of assistants
        System.out.println("Enter the number of assistants: ");
        int numberOfAssistants = scanner.nextInt();

        // Divide the script and distribute among assistants
        divideAndDistribute(script, numberOfAssistants);

        // Close the scanner
        scanner.close();
    }

    private static void divideAndDistribute(String script, int numberOfAssistants) {
        int scriptLength = script.length();
        int portionSize = scriptLength / numberOfAssistants;

        System.out.println("\nDistribution of Script Portions:");

        for (int i = 0; i < numberOfAssistants; i++) {
            int startIdx = i * portionSize;
            int endIdx = (i == numberOfAssistants - 1) ? scriptLength : (i + 1) * portionSize;

            String portion = script.substring(startIdx, endIdx);

            System.out.println("Assistant " + (i + 1) + ": " + portion);
        }
    }
}
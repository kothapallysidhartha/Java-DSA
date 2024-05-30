import java.util.Scanner;

public class ScriptDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the total number of characters in the script
        System.out.print("Enter the total number of characters in the script: ");
        int totalCharacters = scanner.nextInt();

        // Get the number of assistants
        int numberOfAssistants = 3;

        // Calculate the characters per assistant
        int charactersPerAssistant = totalCharacters / numberOfAssistants;

        // Print the division of the script
        System.out.println("\nScript Division:");

        for (int i = 1; i <= numberOfAssistants; i++) {
            int startCharacter = (i - 1) * charactersPerAssistant + 1;
            int endCharacter = i * charactersPerAssistant;

            System.out.println("Assistant " + i + ": Characters " + startCharacter + " to " + endCharacter);
        }

        // Close the scanner
        scanner.close();
    }
}

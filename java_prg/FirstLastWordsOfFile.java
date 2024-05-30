import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FirstLastWordsOfFile {
    public static void main(String[] args) {
        // Replace "C:\Users\kotha\OneDrive\Desktop\java\java_prg\abc.txt" with the path to your text file
        String filePath = "C:\Users\kotha\OneDrive\Desktop\java\java_prg\abc";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into words
                String[] words = line.split("\\s+");

                // Print the first and last words
                if (words.length > 0) {
                    System.out.println("Line: " + line);
                    System.out.println("First Word: " + words[0]);
                    System.out.println("Last Word: " + words[words.length - 1]);
                    System.out.println();
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
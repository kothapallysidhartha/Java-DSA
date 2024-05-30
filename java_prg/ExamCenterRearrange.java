import java.util.Arrays;
public class ExamCenterRearrange {
    public static void main(String[] args) {
        // Example 2D array
        int[][] originalArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Print the original array
        System.out.println("Original Array:");
        printArray(originalArray);

        // Rearrange the array
        int[][] rearrangedArray = rearrangeArray(originalArray);

        // Print the rearranged array
        System.out.println("\nRearranged Array:");
        printArray(rearrangedArray);
    }

    private static int[][] rearrangeArray(int[][] originalArray) {
        int rows = originalArray.length;
        int cols = originalArray[0].length;

        // Create a new 2D array for the rearranged placement
        int[][] rearrangedArray = new int[cols][rows];

        // Rearrange the array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rearrangedArray[j][i] = originalArray[i][j];
            }
        }

        return rearrangedArray;
    }

    private static void printArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
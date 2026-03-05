/**
 * =============================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * =============================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
 * This use case focuses on performance
 * measurement and algorithm benchmarking concepts.
 *
 * The goal is to introduce benchmarking concepts.
 *
 * @author Vishalini P G
 * @version 13.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Input string
        String input = "Level";

        // Normalize input
        input = input.toLowerCase();

        // Start time capture
        long startTime = System.nanoTime();

        // Palindrome checking logic
        boolean isPalindrome = true;
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // End time capture
        long endTime = System.nanoTime();

        // Calculate execution duration
        long executionTime = endTime - startTime;

        // Display results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");
    }
}

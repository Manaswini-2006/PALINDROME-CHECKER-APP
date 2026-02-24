/*
 * UseCase4PalindromeCheckerApp.java
 *
 * UC4: Character Array Based Palindrome Check
 * Objective: Convert string to char[] and compare characters
 * using the two-pointer technique.
 */

public class PalindromeCheckerApp {

    // Main Method - Entry point of the Java application
    public static void main(String[] args) {

        System.out.println("===== Palindrome Checker App - UC4 =====");

        // Original String
        String original = "radar";

        // Convert String to Character Array (char[])
        char[] characters = original.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {

            // Compare characters at start and end index
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        System.out.println("Original String: " + original);

        if (isPalindrome) {
            System.out.println("Result: \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("Result: \"" + original + "\" is NOT a Palindrome.");
        }

        System.out.println("Program Completed.");
    }
}
/*
 * UseCase3PalindromeCheckerApp.java
 *
 * UC3: Palindrome Check Using String Reverse
 * Objective: Check whether a string is a palindrome
 * by reversing it using a for loop.
 */

public class PalindromeCheckerApp {

    // Main Method - Entry point of the Java application
    public static void main(String[] args) {

        System.out.println("===== Palindrome Checker App - UC3 =====");

        // Original String
        String original = "level";

        // Variable to store reversed string
        String reversed = "";

        // Loop (for loop) - iterate in reverse order
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);  // String Concatenation
        }

        // Display reversed string
        System.out.println("Original String : " + original);
        System.out.println("Reversed String : " + reversed);

        // Compare using equals() method
        if (original.equals(reversed)) {
            System.out.println("Result: The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("Result: The string \"" + original + "\" is NOT a Palindrome.");
        }

        System.out.println("Program Completed.");
    }
}

/*
 * UseCase2PalindromeCheckerApp.java
 *
 * UC2: Print a Hardcoded Palindrome Result
 * Objective: Check whether a hardcoded string is a palindrome
 * and display the result.
 */

public class PalindromeCheckerApp {

    // Main Method - Entry point of the Java application
    public static void main(String[] args) {

        // Program starts
        System.out.println("===== Palindrome Checker App - UC2 =====");

        // Hardcoded String (String Literal stored in String Pool)
        String word = "madam";

        // Display the word being checked
        System.out.println("Checking word: " + word);

        // Reverse the string
        String reversed = new StringBuilder(word).reverse().toString();

        // Conditional Statement (if-else)
        if (word.equals(reversed)) {
            System.out.println("Result: The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("Result: The word \"" + word + "\" is NOT a Palindrome.");
        }

        // Program exits
        System.out.println("Program execution completed.");
    }
}

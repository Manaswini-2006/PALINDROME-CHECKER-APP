/*
 * UseCase5PalindromeCheckerApp.java
 *
 * UC5: Stack-Based Palindrome Checker
 * Objective: Use Stack (LIFO) to validate palindrome.
 */

import java.util.Stack;

public class PalindromeCheckerApp {

    // Main Method - Entry point of the Java application
    public static void main(String[] args) {

        System.out.println("===== Palindrome Checker App - UC5 =====");

        // Original String
        String original = "madam";

        // Create Stack (Data Structure)
        Stack<Character> stack = new Stack<>();

        // Push Operation - Insert characters into stack
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        // Pop Operation & Comparison
        boolean isPalindrome = true;

        for (int i = 0; i < original.length(); i++) {
            char poppedChar = stack.pop();  // Removes in reverse order

            if (original.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
        }

        // Display Result
        System.out.println("Original String: " + original);

        if (isPalindrome) {
            System.out.println("Result: \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("Result: \"" + original + "\" is NOT a Palindrome.");
        }

        System.out.println("Program Completed.");
    }
}
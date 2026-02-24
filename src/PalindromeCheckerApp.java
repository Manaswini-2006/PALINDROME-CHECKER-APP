/*
 * UseCase6PalindromeCheckerApp.java
 *
 * UC6: Queue + Stack Based Palindrome Check
 * Objective: Demonstrate FIFO vs LIFO behavior
 * and validate palindrome using both data structures.
 */

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    // Main Method - Entry point of the Java application
    public static void main(String[] args) {

        System.out.println("===== Palindrome Checker App - UC6 =====");

        // Original String
        String original = "level";

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Insert characters into both Stack and Queue
        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);
            stack.push(ch);      // LIFO
            queue.add(ch);       // FIFO (Enqueue)
        }

        boolean isPalindrome = true;

        // Compare dequeue (queue) with pop (stack)
        while (!stack.isEmpty()) {

            char fromQueue = queue.remove();  // Dequeue (FIFO)
            char fromStack = stack.pop();     // Pop (LIFO)

            if (fromQueue != fromStack) {
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
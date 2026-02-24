import java.util.*;

public class PalindromeCheckerApp {

    // ---------- Approach 1: Two-Pointer String ----------
    public static boolean stringPalindrome(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start++) != str.charAt(end--)) {
                return false;
            }
        }
        return true;
    }

    // ---------- Approach 2: Stack ----------
    public static boolean stackPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // ---------- Approach 3: Deque ----------
    public static boolean dequePalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    // ---------- Approach 4: Recursion ----------
    public static boolean recursivePalindrome(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return recursivePalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check palindrome performance:");
        String input = scanner.nextLine();

        // Normalize once
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        System.out.println("\n--- Performance Comparison (nanoseconds) ---");

        long start, end;

        start = System.nanoTime();
        boolean r1 = stringPalindrome(normalized);
        end = System.nanoTime();
        System.out.println("String Two-Pointer: " + (end - start) + " ns");

        start = System.nanoTime();
        boolean r2 = stackPalindrome(normalized);
        end = System.nanoTime();
        System.out.println("Stack Approach    : " + (end - start) + " ns");

        start = System.nanoTime();
        boolean r3 = dequePalindrome(normalized);
        end = System.nanoTime();
        System.out.println("Deque Approach    : " + (end - start) + " ns");

        start = System.nanoTime();
        boolean r4 = recursivePalindrome(normalized, 0, normalized.length() - 1);
        end = System.nanoTime();
        System.out.println("Recursive Approach: " + (end - start) + " ns");

        System.out.println("\nPalindrome Result: " + r1);
        scanner.close();
    }
}
import java.util.Scanner;

public class PalindromeCheckerApp {

    // Node class for Singly Linked List
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the linked list
    static Node head;

    // Add node at end
    static void add(char data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Reverse linked list
    static Node reverse(Node node) {
        Node prev = null;
        Node current = node;

        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    // Check palindrome
    static boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // Fast and slow pointers to find middle
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalfStart = reverse(slow.next);
        Node firstHalfStart = head;

        // Compare both halves
        Node tempSecond = secondHalfStart;
        boolean result = true;

        while (tempSecond != null) {
            if (firstHalfStart.data != tempSecond.data) {
                result = false;
                break;
            }
            firstHalfStart = firstHalfStart.next;
            tempSecond = tempSecond.next;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check for palindrome:");
        String input = scanner.nextLine().toLowerCase();

        // Convert string to linked list
        for (int i = 0; i < input.length(); i++) {
            add(input.charAt(i));
        }

        // Check palindrome
        if (isPalindrome()) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}
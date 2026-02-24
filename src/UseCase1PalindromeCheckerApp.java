/*
 * UseCase1PalindromeCheckerApp.java
 *
 * UC1: Application Entry & Welcome Message
 * Objective: Display application details when the program starts.
 */

public class UseCase1PalindromeCheckerApp {

    // Application constants
    static final String APP_NAME = "Palindrome Checker App";
    static final String VERSION = "Version 1.0";
    static final String DEVELOPER = "Developed for Learning Core Java Concepts";

    // Main Method - Entry point of the Java application
    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=====================================");
        System.out.println("        " + APP_NAME);
        System.out.println("        " + VERSION);
        System.out.println("=====================================");
        System.out.println(DEVELOPER);
        System.out.println("-------------------------------------");

        // Application startup message
        System.out.println("Application has started successfully.");
        System.out.println("Ready to proceed to palindrome validation use cases.");
        System.out.println("-------------------------------------");

        // End of UC1
        System.out.println("Exiting UC1...");
    }
}
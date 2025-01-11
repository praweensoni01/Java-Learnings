import java.util.Scanner;

public class PalindromeNum {
    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Add it to the reversed number
            number /= 10; // Remove the last digit
        }

        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input range from the user
        System.out.print("Enter the starting range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending range: ");
        int end = scanner.nextInt();

        System.out.println("Palindrome numbers between " + start + " and " + end + ":");

        // Iterate through the range and check for palindrome numbers
        for (int i = start; i <= end; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
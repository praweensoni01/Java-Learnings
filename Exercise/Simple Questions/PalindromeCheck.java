import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Store the original number for comparison
        int originalNumber = number;
        int reversedNumber = 0;
        
        // Reverse the number
        while (number != 0) {
            int digit = number % 10;       // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Add it to the reversed number
            number /= 10;                 // Remove the last digit from the number
        }
        
        // Check if the original number is equal to the reversed number
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
        
        scanner.close();
    }
}

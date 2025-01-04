// Write a program to find whether the given number is Armstrong.
// Example : 371 = 3*3 + 7*3 + 1*3 = 371 hence 371 is Armstrong number(Narcissistic Numbers).
// Example : 153 = 1*3 + 5*3 + 3*3 = 371 hence 371 is Armstrong number(Narcissistic Numbers).
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int result = 0;
        int numberOfDigits = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        return result == originalNumber;
    }
}

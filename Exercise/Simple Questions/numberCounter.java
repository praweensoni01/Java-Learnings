import java.util.Scanner;

public class numberCounter {
    // Write a program to enter the number till the user wants and the end it should display the count of positive, negative and zeros entered.
    static void numberCounter1(){
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
        char choice;

        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next().toLowerCase().charAt(0);
        } while (choice == 'y');

        System.out.println("\nSummary:");
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeros: " + zeroCount);

        scanner.close();
    }
    //Write a program to enter the number till the user wants and the end it should display the count of positive, negative and zeros entered also sum of the all postive and negative number.
    static void numberCounter2(){
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0, positiveCountAdd = 0, negativeCount = 0,negativeCountAdd = 0, zeroCount = 0;
        char choice;

        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number > 0) {
                positiveCountAdd += number;
                positiveCount++;
            } else if (number < 0) {
                negativeCountAdd += number;
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next().toLowerCase().charAt(0);
        } while (choice == 'y');

        System.out.println("\nSummary:");
        System.out.println("Positive numbers: " + positiveCount + " Sum of all them : " + positiveCountAdd);
        System.out.println("Negative numbers: " + negativeCount + " sum of all them : " + negativeCountAdd);
        System.out.println("Zeros: " + zeroCount);

        scanner.close();
    }
    

    public static void main(String[] args) {
        // numberCounter1();
        numberCounter2();
    }
}

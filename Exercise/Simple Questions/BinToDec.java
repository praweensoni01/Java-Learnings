import java.util.Scanner;
public class BinToDec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();
        int decimal = Integer.parseInt(binaryString, 2);   // Converts binary to decimal
        //Explain : Integer.parseInt is a method in Java that converts a string into an integer.
        //binaryString is the input string that represents a binary number.
        //The 2 in the method tells Java to interpret the binaryString as a binary (base-2) number.
        System.out.println("The decimal equivalent is: " + decimal);
        scanner.close();
    }
}

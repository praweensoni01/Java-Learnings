// Two number are entered by the user, z and n. write a function to find the value of one number raised to the power of another i.e. x power n. in java
import java.util.Scanner;

class PowerCalc {
    // Function to calculate z^n
    public static double power(double z, int n) {
        return Math.pow(z, n); // Using Math.pow for power calculation
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number (z): ");
        double z = scanner.nextDouble();

        System.out.print("Enter the exponent (n): ");
        int n = scanner.nextInt();

        double result = power(z, n);

        System.out.println(z + " raised to the power of " + n + " is : " + result);
        scanner.close();
    }
}

// Swap number without using third variable in java.
import java.util.Scanner;

class swapnum{
    static void numSwap(){
        System.out.println("Swap number without using third variable.");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        System.out.println("Your input number variable is here :");
        System.out.println("num 1 value is :" + num1);
        System.out.println("num 2 value is :" + num2);
        // Logic here
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("Swaped value is here :");
        System.out.println("num 1 value is :" + num1);
        System.out.println("num 2 value is :" + num2);
    }
    public static void main(String [] args){
        numSwap();
    }
}
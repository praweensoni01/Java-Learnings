import java.util.Scanner;
class Factorial{
    static int findFactorial(int n){
        if(n == 0){
            return 1;
        }else{
            return n * findFactorial(n - 1);
        }
    }
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive number :");
        num = sc.nextInt();

        if(num < 0){
            System.out.println("Factorial is not calculated for negative number.");
        }else{
            System.out.println("Factorial of " + num + " is " + findFactorial(num));
        }
        sc.close();
    }
}
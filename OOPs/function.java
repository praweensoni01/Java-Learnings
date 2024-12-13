import java.util.Scanner;

class function{

    static int multiply(int a,int b){
        return a*b;
    }
    
    static void factorial(int n){
        if(n<0){
            System.out.println("Invalid number. Number should be greater then Zero.");
            return;
        }
        int fact = 1;
        for(int i=n;i>=1;i--){
            fact = fact * i;
        }
        System.out.println("Factorial of this number is : " + fact);

        // Optional, if we not write return; its ok no problem.
        return;
    }

    public static void main(String[] args){
        System.out.println("Multiply Two Number Program. ");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number One by One : ");
        int a = sc.nextInt();
        // int b = sc.nextInt();

        // Method 1
        // int multi = multiply(a,b);
        // System.out.println("Multiplication is : " + multi);

        // Method 2
        // System.out.println("Multiplication is : " + multiply(a,b));

        // Factorial funtion
        factorial(a);
    }
}
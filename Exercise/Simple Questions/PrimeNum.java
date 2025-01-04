// WAP to enter a two number and find prime number between them.

import java.util.Scanner;

public class PrimeNum {
    public static void main(String args[]){
        int lower, upper;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a minimum number to find Prime number : ");
        lower = sc.nextInt();
        System.out.print("Enter a maximum number to find Prime number : ");
        upper = sc.nextInt();
        sc.close();
        for(int i = lower; i <= upper; i++){
            if ((isPrime(i)))   System.out.println(i);
        }
    }
    static boolean  isPrime(int n){
        if(n<2) return false;

        for(int i = 2;i<n;i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}

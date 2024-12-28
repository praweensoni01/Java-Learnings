// Write a program to print Fibonacci series using loop.
import java.util.Scanner;

class FibonacciSeries{
    public static void main(String args[]){
        int n, first_term = 0, sec_term = 1, next_term, i;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number of terms :");
        n = sc.nextInt();
        
        System.out.println("First terms of the fibonacci series :" + n);
        for(i = 0; i<n; i++){
            if(i<=1){
                next_term = i;
            }else{
                next_term = first_term + sec_term;
                first_term = sec_term;
                sec_term = next_term;
            }
            System.out.println(next_term);
        }
        System.out.println();
    }
}
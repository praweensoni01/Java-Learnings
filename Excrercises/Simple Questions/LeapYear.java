// WAP to check leap year or not.
import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]){
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year : ");
        y = sc.nextInt();
        sc.close();
        if (y % 4 == 0) {
            if (y % 100 == 0) {
                if (y % 400 == 0) 
                    System.out.println(y + " is a Leap Year.");
                else
                    System.out.println(y + " is not a leap Year.");
                }
                else
                    System.out.println(y + " is not a leap Year.");
                }else
                    System.out.println(y + " is not a leap Year.");
    }
}
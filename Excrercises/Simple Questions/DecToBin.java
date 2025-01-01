// WAP to convert Decimal number to binary number.

import java.util.Scanner;

public class DecToBin {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long binarynum = 0;
        int dec, rem, temp = 1;
        System.out.print("Enter a Decimal number :");
        dec = sc.nextInt();
        sc.close();
        while(dec!=0){
            rem = dec%2;
            dec = dec / 2;
            binarynum = binarynum + rem*temp;
            temp = temp * 10;
        }
        System.out.print("Binary number is : " + binarynum);
    }
}

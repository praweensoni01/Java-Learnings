// WAP to arrange numbers in ascending order.

import java.util.Scanner;

public class ascOrder {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(" How many number you are gonna enter : ");
        int count = sc.nextInt();
        // int arrSize = sc.nextInt();
        int num[] = new int[count];
        System.out.println("Enter a Array number one by one : ");
        for(int i = 0; i < count; i++){
            num[i] = sc.nextInt();
        }
        sc.close();
        sortNum(num, count);
    }
    static void sortNum(int num[], int count){
        int temp, i, j, k;

        for(j=0;j<count;++j){
            for(k=j+1;k<count; ++k){
                if (num[j]> num[k]) {
                    temp = num[j];
                    num[j] = num[k];
                    num[k] = temp;
                }
            }
        }

        System.out.println("Numbers in ascending order : ");
        for(i=0;i<count;i++)
            System.out.println(num[i]);
    }
}
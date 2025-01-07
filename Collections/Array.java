// Tip : By Default java store values like :
// int = 0, float = 0.0, boolean = false, Object = null, String = " ". (In c++ That stores Garbage Values.)

import java.util.Scanner;

class Array{
    static void arrayMulti(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Array Size : ");
        int arrSize = sc.nextInt();
        int num[] = new int[arrSize];

        // Input values in Arrays
        // Tip : num.length is == arrSize (length use always..)
        //Method 1
        // for(int i=0;i<num.length; i++){
        //Method 2
        for(int i=0;i<arrSize; i++){
            num[i] = sc.nextInt();
        }
        //Output Display of Arrays
        System.out.println("Your array looks like :");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+ " , ");
        }
        sc.close();
    } 
    public static void main(String []args){
        // int arr1[] = new int[3];
        // int[] arr1 = new int[3];
        // arr1[0] = 90;
        // arr1[1] = 80;
        // arr1[2] = 60;

        // Method 2
        // int arr1[] = {10, 20, 30};  // For fixed element. 
        // System.out.println("Java Array Program. Index 1 Value is :" + arr1[1]);
        // System.out.println("Array Print Returns Grabage Value :" + arr1);
        arrayMulti();
    }
}
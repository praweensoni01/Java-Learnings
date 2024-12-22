import java.util.*;

class Exercise{
    static void GreaterTwoNum(){
        System.out.println("Enter two num. this function find greater of those two.");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1 > num2){
            System.out.println("The greater number is : " + num1);
        }else if(num1 < num2){
            System.out.println("The greater number is : " + num2);
        }else{
            System.out.println("Both Number are Equal : " + num1 + " , " + num2);
        }
    }
    
    static void addOddNum(){
        System.out.println("Enter the range (Number) to add all odd number.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sumNum = 0;
        for(int i = 0; i<=num ; i++){
            if(i%2!=0){
                sumNum = sumNum + i;
            }
        }
        System.out.println("Sum of All Odd numbers :" + sumNum);
    }

    static void NumAvg(){
        System.out.println("Enter 3 Number to calculate average of the number.");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("Average of these 3 numbers are : " + (num1 + num2 + num3)/3);
    }
    
    static void numSwap(){
        System.out.println("Swap number without using third variable.");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("num 1 value is :" + num1);
        System.out.println("num 2 value is :" + num2);
    }

    static void circumference(){
        System.out.println("Enter a radius (number) to Find Circumference : ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextInt();

        // double cf=2*(22/7)*radius;   // Mistake : When i write 22 / 7, Java performs integer division because both 22 and 7 are integers. This results in 3 (the integer part of 22/7) instead of 3.142857.
        // double cf=2*(22.0/7)*radius;   // Mistake : fixed in this line but it also lesser accurate comapre then both
        // double cf=2*3.14*radius;    // less accurate comapre then math.pi
        double cf = 2 * Math.PI * radius; // More accurate

        System.out.println("Circumference of "+radius+" is  : " + cf);
    }

    public static void main(String [] args){
        // addOddNum();
        // NumAvg();
        //GreaterTwoNum();
        // numSwap();
        circumference();
    }
}
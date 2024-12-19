import java.util.*;

class Exercise1{
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

    public static void main(String [] args){
        // addOddNum();
        // NumAvg();
        //GreaterTwoNum();
        // Circumference=2×π×radius
        numSwap();
    }
}
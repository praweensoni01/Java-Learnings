import java.util.Scanner;

class GreatestOfThreeNum{
    public static void main(String args[]){
        double num1, num2, num3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number :");
        num1 = sc.nextInt();
        System.out.println("Enter Second number :");
        num2 = sc.nextInt();
        System.out.println("Enter Third number :");
        num3 = sc.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println("Greater number is : " + num1);
        }

        if(num2 >= num1 && num2 >= num3){
            System.out.println("Greater number is : " + num2);
        }

        if(num3 >= num1 && num3 >= num2){
            System.out.println("Greater number is : " + num3);
        }
        sc.close();
    }
}
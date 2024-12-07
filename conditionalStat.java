// Conditional Statements in Java
import java.util.*;

class conditionalStat{
    public static void main(String []args){
        // If else Example 

        // Scanner inp = new Scanner(System.in);
        // int age = inp.nextInt();
        // if(age>=18){
        //     System.out.println("You are adult. Your Age :" + age);
        // }else{
        //     System.out.println("You are Not adult! Your age is below then 18. Your Age :" + age);
        // }


        // If else if Example

        // System.out.println("Now You can Check Your Two number are equal or not!...");
        // Scanner val = new Scanner(System.in);
        // int a = val.nextInt();
        // int b = val.nextInt();
        // if(a==b){
        //     System.out.println("Your input number is Equal :" + a +" == "+ b);
        // }else if(a>b){
        //     System.out.println("A is greater then B :" + a +" > "+ b);
        // }else{
        //     System.out.println("B is greater then A :" + a +" < "+ b);
        // }


        // Switch Statement Example

        System.out.println("Now Switch Statement example Start.");
        Scanner val = new Scanner(System.in);
        int inp = val.nextInt();
        switch(inp){
            case 1:System.out.println("Hello Bro!");
            break;
            case 2:System.out.println("Hii Bro!");
            break;
            case 3: {
                System.out.println("Namsate Bro!");
                System.out.println("Namsate Bro! Again.");
                }
            break;
            default :System.out.println("Defaut line Always execute when any option not matched!.");
        }
    }
}
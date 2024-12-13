import java.util.*;

class Loop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // For Loop (Table Print using for loop.)
        for(int count = 0; count < 10; count = count + 1){
            System.out.println(n + " * " + (count + 1) + " = " + (n*(count + 1)));
        }

        //  While Loop

        // int i = 1;
        // while(i<11){
        //     System.out.println(i);
        //     i = i+1;
        // }

        // Do While Loop

        // do{
        //     System.out.println(i);
        //     i=i+1;
        // }while(i<11);
    }
}
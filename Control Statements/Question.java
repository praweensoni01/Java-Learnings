import java.util.*;
class Question{
    public static void main(String arg[]){
        int choice;
        Scanner sc= new Scanner(System.in);
        do{
        System.out.print("Enter 1 to input marks or 0 to stop program : ");
        choice = sc.nextInt();
        if(choice==1){
            System.out.println("Enter marks (out of 100) : ");
            int marks = sc.nextInt();
            if(marks>=90){
                System.out.println("Very good");
            }
            else if(marks>=60){
                System.out.println("This is also good");
            }
            else if(marks>=0){
                System.out.println("Not bad");
            }
            else {
                System.out.println("Invalid marks plase enter a value between 0 to 100.");
            }
        }
        else if(choice!=0){
                System.out.println("Invalid choice please enter 1 to continue or 0 to stop the program.");
            }
        }
        while(choice!=0);
        System.out.println("Program stopped.");
        sc.close();
    }
}
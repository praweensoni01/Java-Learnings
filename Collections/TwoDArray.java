import java.util.Scanner;

class TwodArray{
    static void SearchXMatrix(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows and Columns for 2D Array.");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int array[][] = new int[rows][cols];
        
        System.out.println("Enter 2D Array Elements one by one.");
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols; j++){
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Number for search in 2D Array.");
        int search = sc.nextInt();

        // Pre is a variable that show element present or not
        int Pre = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols; j++){
                if(array[i][j] == search){
                    Pre = 1;
                    System.out.println("Your Search Element On Rows : Columns " + i +","+ j);
                }
            }
        }
        if(Pre == 0){
            System.out.println("Search Element Not Found...!");
        }
    }
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);

        // int rows = sc.nextInt();
        // int cols = sc.nextInt();

        // int [][] numbers = new int[rows][cols];
        // // Input 2D Array.
        // for(int i=0; i<rows; i++){
        //     for(int j=0; j<cols; j++){
        //         numbers[i][j] = sc.nextInt();
        //     }
        // }

        // // Printing 2D Array. 
        // for(int i=0; i<rows; i++){
        //     for(int j=0; j<cols; j++){
        //         System.out.print(numbers[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        SearchXMatrix();
    }
}
import java.util.Scanner;

class SumAvgCalc {
    public static int[] calculate(int n) { 
        Scanner sc = new Scanner(System.in);
        int sum = 0, number;
        
        for (int i = 1; i <= n; i++) { 
            System.out.print("Enter the number: ");
            number = sc.nextInt();
            sum = sum + number;          
        }
        int average = sum / n;      
        int result[] = {sum, average};
        sc.close();
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count number: ");
        int a = sc.nextInt();
        int result[] = calculate(a);
        System.out.println("Sum of all numbers = " + result[0]);
        System.out.println("Average of all numbers = " + result[1]);
        sc.close();
    }
}

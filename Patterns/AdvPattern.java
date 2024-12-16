import java.util.*;

public class AdvPattern{
    static void butterflyptrn(){
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // Spaces
            int Spaces = 2 * (n-i);
            for(int j=1;j<=Spaces; j++){
                System.out.print(" ");
            }
            //2nd part 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower part
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // Spaces
            int Spaces = 2 * (n-i);
            for(int j=1;j<=Spaces; j++){
                System.out.print(" ");
            }
            //2nd part 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void SolidRhombus(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void NumberPyramid(){
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    static void PalindromicPtrn(){
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;i++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            // for(int j=2;j<=i;j++){
            //     System.out.print(j);
            // }
            System.out.println();
        }
    }
    static void diamondPtrn(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        //butterflyptrn();
        //SolidRhombus();
        // NumberPyramid();
        // PalindromicPtrn();  Revision
        // diamondPtrn();
    }
}
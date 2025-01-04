class Patterns{
    public static void main(String []args){
        int n = 5;
        int m = 5;

        System.out.println("Solid Rectangle");

        for( int i =0;i<n;i++){
            for(int j = 0; j<m ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Hollow Rectangle");
 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 || j == 1 || i == n || j == m){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("Half Pyramid");
 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Inverted Half Pyramid : Method 1");
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Inverted Half Pyramid : With Numbers");
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
        System.out.println("Inverted Half Pyramid : Method 2");
        
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Inverted Half Pyramid Rotated by 180deg");
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Inverted Half Pyramid : with Boolean value");
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int sum = i + j;
                if(sum % 2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
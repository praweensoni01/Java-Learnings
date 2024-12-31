import java.util.Scanner;

class areaOfCircle {
    public static void main(String[] args) {
        double r, area;
        double pi = 3.14;
        System.out.print("Enter the radius of the circle: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextDouble();
        sc.close();
        area = pi * r * r; // Formula for area of a circle
        System.out.println("Area of the circle = " + area);
    }
}

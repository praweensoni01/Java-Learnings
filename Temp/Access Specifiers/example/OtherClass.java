// package Temp.Access Specifiers;

package example;

// import example.MainClass;

public class OtherClass {
    public static void main(String[] args) {
        MainClass obj = new MainClass();

        System.out.println("Accessing variables in another package:");
        System.out.println("Public: " + obj.publicVariable);        // Accessible
        // System.out.println("Private: " + obj.privateVariable);  // Not Accessible
        // System.out.println("Protected: " + obj.protectedVariable); // Not Accessible
        // System.out.println("Default: " + obj.defaultVariable);     // Not Accessible
    }
}

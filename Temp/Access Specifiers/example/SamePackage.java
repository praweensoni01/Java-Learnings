// package Temp.Access Specifiers;

package example;

public class SamePackage {
    public static void main(String[] args) {
        MainClass obj = new MainClass();

        System.out.println("Accessing variables in the same package:");
        System.out.println("Public: " + obj.publicVariable);        // Accessible
        // System.out.println("Private: " + obj.privateVariable);  // Not Accessible
        System.out.println("Protected: " + obj.protectedVariable); // Accessible
        System.out.println("Default: " + obj.defaultVariable);     // Accessible
    }
}
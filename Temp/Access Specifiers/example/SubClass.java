// package Temp.Access Specifiers;

package example;
// import example.MainClass;

public class SubClass extends MainClass {
    public static void main(String[] args) {
        SubClass obj = new SubClass();

        System.out.println("Accessing variables in a subclass from another package:");
        System.out.println("Public: " + obj.publicVariable);        // Accessible
        // System.out.println("Private: " + obj.privateVariable);  // Not Accessible
        System.out.println("Protected: " + obj.protectedVariable); // Accessible (inherited)
        // System.out.println("Default: " + obj.defaultVariable);  // Not Accessible
    }
}
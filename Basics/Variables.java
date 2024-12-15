// Variables.java
public class Variables {

    // Instance variable
    String instanceVariable = "I am an instance variable";

    // Static variable
    static String staticVariable = "I am a static variable";

    public static void main(String[] args) {
        // Local variable
        int localVariable = 42;

        // Display the local variable
        System.out.println("Local Variable: " + localVariable);

        // Accessing static variable
        System.out.println("Static Variable: " + staticVariable);

        // Creating an object to access instance variable
        Variables obj = new Variables();
        System.out.println("Instance Variable: " + obj.instanceVariable);

        // Changing the value of a local variable
        localVariable = 100;
        System.out.println("Updated Local Variable: " + localVariable);

        // Example of variable declaration and initialization (Commonly Use)
        int num = 25;               // Declaring and initializing
        double deci = 5.9;          // Decimal value
        char character = 'A';       // Character(it only store one character only.)
        boolean isContinue = true;  // Boolean

        // Print all variables
        System.out.println("Number : " + num);
        System.out.println("Decimal Value: " + deci);
        System.out.println("Character: " + character);
        System.out.println("Boolean Value: " + isContinue);
    }
}

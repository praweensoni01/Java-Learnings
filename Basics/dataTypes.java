// DataTypes.java
public class DataTypes {

    public static void main(String[] args) {
        // Primitive data types in java
        byte byteValue = 127;            // Range: -128 to 127
        short shortValue = 32000;        // Range: -32,768 to 32,767
        int intValue = 100000;           // Range: -2^31 to 2^31-1
        long longValue = 10000000000L;   // Range: -2^63 to 2^63-1

        float floatValue = 3.14f;        // 32-bit floating-point
        double doubleValue = 3.14159265359; // 64-bit floating-point

        char charValue = 'A';            // Single 16-bit Unicode character
        boolean booleanValue = true;     // true or false

        // Print the values of each data type
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Int Value: " + intValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Char Value: " + charValue);
        System.out.println("Boolean Value: " + booleanValue);

        // String (not a primitive type, but widely used)
        String stringValue = "Hello, Java! by Praween Soni";
        System.out.println("String Value: " + stringValue);
    }
}

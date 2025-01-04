// WAP a program to find size of different data types

public class DataTypeSize {
    public static void main(String args[]){
        System.out.println("JAVA Data types size in local computer.");
        System.out.println("Size of int: "+ (Integer.SIZE/8)+ " bytes.");
        System.out.println("Size of long: "+ (Long.SIZE/8)+ " bytes.");
        System.out.println("Size of Char: "+ (Character.SIZE/8)+ " bytes.");
        System.out.println("Size of float: "+ (Float.SIZE/8)+ " bytes.");
        System.out.println("Size of double: "+ (Double.SIZE/8)+ " bytes.");
    }
}

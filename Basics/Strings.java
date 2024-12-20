import java.util.Scanner;

// Tip : Strings are Inmutable(Not changebal) in java (IF i want to modify to a string then create a new string and modify orignal string and store to new string variable.)


class Strings{

    public static void main(String args[]){
        String fname = "Praween";
        String lname = "Soni";
        //Concatenation
        String fullname = fname + " " + lname;  // When line end then space will delete from memory because it not store in any variable (Temproary created memeory).
        // System.out.println("Your name : " + fullname);
        // System.out.println("Your name length : " + fullname.length());
        // for(int i=0; i<fullname.length();i++){
        //     System.out.println("Your name single Character : " + fullname.charAt(i));
        // }

        //Compare
        String name1 = "Pks";
        String name2 = "Pks";
        //Consitions for compareTo function
        //1 s1 > s2 : +ve value (anything)
        //1 s1 = s2 : 0
        //1 s1 < s2 : -ve value (anything)
        // Method 1 : Best method
        // if(name1.compareTo(name2) == 0){
        //     System.out.println("String are Equal.");
        // }else{
        //     System.out.println("String are Not Equal.");
        // }
        // Method 2 : not recommanded (Same cases it failed on coding test cases)
        // if(name1 == name2){
        //     System.out.println("String are Equal.");
        // }else{
        //     System.out.println("String are Not Equal.");
        // }
        // Example 2 : Better understanding for don't use == for compare two string
        // if(new String("Pks") == new String("Pks")){
        //     System.out.println("String are Equal.");
        // }else{
        //     System.out.println("String are Not Equal.");
        // }

        String sentence = "My name is Praween Soni";
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);
        String f_name = sentence.substring(11, 19);
        System.out.println(f_name);
        String l_name = sentence.substring(19);
        System.out.println(l_name);

        //input a string
        // Scanner sc = new Scanner(System.in);
        // String iname = sc.next();  // For single string
        // String iname = sc.nextLine();  // For full line also spaces
        // System.out.println("Your name : " + iname);
    }
}
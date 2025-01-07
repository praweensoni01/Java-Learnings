// Write class name first letter capital
// Made a class name Student
// class Student {
//     String name;
//     int rollno;

//     public void stuInfo(){
//         System.out.println("Student Name : " + this.name);
//         System.out.println("Student Roll Number : " + this.rollno);
//     }

//     // Non Prameterize Constructor
//     // Student(){
//     //     System.out.println("Student class constructor.");
//     // }
//     // Prameterize Constructor
//     Student(String name, int rollno){
//         this.name = name;
//         this.rollno = rollno;
//         System.out.println("Student class constructor.");
//     }
// }


// public class ClassOrObject {
//     public static void main(String args[]){
//         // For non prameterize constructor
//         // Create a Student class object.
//         // Student Std1 = new Student();
//         // Std1.name = "Pks";
//         // Std1.rollno = 111;
        
//         // For prameterize constructor
//         Student Std1 = new Student("Pks", 111);
//         Std1.stuInfo();
//     }
// }


// Copy Constructur example :
class Student {
    String name;
    int rollno;

    public void stuInfo(){
        System.out.println("Student Name : " + this.name);
        System.out.println("Student Roll Number : " + this.rollno);
    }

    // Prameterize Constructor
    Student(Student s2){
        this.name = s2.name;
        this.rollno = s2.rollno;
        System.out.println("Student class constructor.");
    }
    // Non Prameterize Constructor
    Student(){
        System.out.println("Student class constructor.");
    }
}


public class ClassOrObject {
    public static void main(String args[]){
        // For non prameterize constructor
        // Create a Student class object.
        Student Std1 = new Student();
        Std1.name = "Pks";
        Std1.rollno = 111;
        Std1.stuInfo();
        // For prameterize constructor
        Student Std2 = new Student(Std1);
        Std2.stuInfo();
    }
}
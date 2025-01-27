package example;

public class MainClass {
    public String publicVariable = "I am Public";
    private String privateVariable = "I am Private";
    protected String protectedVariable = "I am Protected";
    String defaultVariable = "I am Default";

    public void display() {
        System.out.println("Public Variable: " + publicVariable);
        System.out.println("Private Variable: " + privateVariable);
        System.out.println("Protected Variable: " + protectedVariable);
        System.out.println("Default Variable: " + defaultVariable);
    }
    public static void main(String args[]){
        System.out.println("This is main class function");
        MainClass obj = new MainClass();
        obj.display();
    }
}
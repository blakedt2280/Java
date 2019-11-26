public class Main {
    //global variables
    public static String firstName = "Joe";

    public static void main (String[] args) {
        displayName();
    }

    public static void displayName(){
        String lastName = "Somebody";
        System.out.println("Your name is:" + firstName + " " + lastName);
    }
}

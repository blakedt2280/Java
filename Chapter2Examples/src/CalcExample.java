import java.util.Scanner;

public class CalcExample {

    //declare variables
    static String iName;
    static int iHrs;
    static double iRate;
    static double cNetPay;
    static String oHours, oRate, oNetPay;
    static Scanner myScanner;

    public static void main(String[] args){
        //set scanner to the console
        myScanner = new Scanner(System.in);

        System.out.println("Enter Name");
        iName = myScanner.nextLine();

        System.out.println("Enter Hours");
        iHrs = myScanner.nextInt();

        System.out.println("Enter rate:");
        iRate = myScanner.nextDouble();

        cNetPay = iHrs * iRate;

        System.out.println("Wage information for" + iName);
        System.out.println("Hours:" + iHrs);
        System.out.println("Rate:" + iRate);
        System.out.println("Net Pay:" + cNetPay);

        System.out.println("Program Complete");

    }
}

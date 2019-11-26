import java.util.Scanner;

public class Eggs {
    //declare variables

    static int iEggs;
    static int cDozens;
    static int cNonDozens;
    static double cOrderTotal;
    static Scanner myScanner;

    public static void main(String[] args) {
        //set scanner to the console
        myScanner = new Scanner(System.in);

        System.out.println("Enter Number of Eggs");
        iEggs = myScanner.nextInt();
        //calculations
        cDozens = iEggs / 12;
        cNonDozens = iEggs % 126;
        cOrderTotal = (cDozens * 3.25) + (cNonDozens * .45);

        //output
        System.out.println("Number of Eggs Ordered: " + iEggs);
        System.out.println("Number of Dozens Ordered at $3.25 a Dozen: " + cDozens);
        System.out.println("Number of Loose Eggs Ordered at $0.45: " + cNonDozens);
        System.out.println("Total Payment Due: $" + cOrderTotal);


    }
}

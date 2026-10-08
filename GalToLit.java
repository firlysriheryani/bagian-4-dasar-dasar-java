import java.util.Scanner;

public class GalToLit {
    public static void main(String[] args) {
        // declare variables
        Scanner in = new Scanner(System.in);

        System.out.print("Masukan jumlah galon: ");

        double gallons = in.nextDouble();
        double liters = 0;

        // add your calculation here
        liters = gallons * 3.785;

        // output the result to user
        System.out.println(gallons + " gallons equals " + liters + " liters");
    }
}
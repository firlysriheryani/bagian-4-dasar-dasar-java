import java.util.Scanner;

public class soal_no1_4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan alas segitiga (b): ");
        double b = input.nextDouble();

        System.out.print("Masukkan tinggi segitiga (h): ");
        double h = input.nextDouble();

        // Rumus A = (1/2) * b * h
        double A = 0.5 * b * h;

        System.out.println("Luas segitiga (A) adalah: " + A);

        input.close();
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input kata pertama
        System.out.print("Masukkan kata atau frasa pertama: ");
        String kata1 = input.nextLine();

        // Meminta input kata kedua
        System.out.print("Masukkan kata atau frasa kedua: ");
        String kata2 = input.nextLine();

        // Mengubah huruf menjadi huruf kecil dan menghapus spasi serta tanda baca
        kata1 = kata1.toLowerCase().replaceAll("[^a-z]", "");
        kata2 = kata2.toLowerCase().replaceAll("[^a-z]", "");

        // Mengubah string menjadi array karakter
        char[] huruf1 = kata1.toCharArray();
        char[] huruf2 = kata2.toCharArray();

        // Mengurutkan huruf
        Arrays.sort(huruf1);
        Arrays.sort(huruf2);

        // Membandingkan kedua array
        if (Arrays.equals(huruf1, huruf2)) {
            System.out.println("Kedua kata atau frasa adalah anagram.");
        } else {
            System.out.println("Kedua kata atau frasa bukan anagram.");
        }

        // Menutup Scanner
        input.close();
    }
}

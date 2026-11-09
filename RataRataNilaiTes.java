import java.util.Scanner;

public class RataRataNilaiTes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nilaiTes = new int[5];
        int total = 0;

        System.out.println("Masukkan 5 nilai tes (maksimal 100 poin):");
        
        // Menyimpan nilai ke dalam array dan menjumlahkannya
        for (int i = 0; i < 5; i++) {
            System.out.print("Nilai tes ke-" + (i + 1) + ": ");
            nilaiTes[i] = scanner.nextInt();
            total += nilaiTes[i]; // Menambahkan nilai ke total
        }

        // Menghitung rata-rata (dikonversi ke double agar hasilnya akurat)
        double rataRata = (double) total / 5;

        // Menampilkan hasil
        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata nilai mahasiswa: " + rataRata);

        scanner.close();
    }
}

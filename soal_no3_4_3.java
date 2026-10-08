import java.util.Scanner;

public class soal_no3_4_3 {
    public static void main(String[] args) {
        // Kapasitas maksimal satu bus
        final int KAPASITAS_BUS = 45;

        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah orang yang mendaftar: ");
        int totalPendaftar = scanner.nextInt();

        // Menghitung jumlah bus yang terisi penuh menggunakan pembagian integer
        int jumlahBus = totalPendaftar / KAPASITAS_BUS;

        // Menghitung sisa orang yang tidak cukup untuk memenuhi satu bus penuh (naik van)
        int orangNaikVan = totalPendaftar % KAPASITAS_BUS;

        System.out.println("Jumlah bus yang diperlukan: " + jumlahBus);
        System.out.println("Total jumlah orang yang harus naik van: " + orangNaikVan);

        scanner.close();
    }
}


import java.util.Scanner;

public class kakitembok_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Meminta input ukuran ruangan
        System.out.print("Masukkan panjang ruangan (kaki tembok): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar ruangan (kaki tembok): ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi ruangan (kaki tembok): ");
        double tinggi = input.nextDouble();

        // 2. Menghitung luas yang akan dicat (dinding + langit-langit, lantai tidak)
        double luasLangitLangit = panjang * lebar;
        double luasDinding = 2 * (panjang * tinggi) + 2 * (lebar * tinggi);
        double totalLuas = luasLangitLangit + luasDinding;

        System.out.println("\nTotal luas yang harus dicat: " + totalLuas + "kaki tembok persegi.");

        // 3. Menghitung kebutuhan cat (1 ember 5L = 1500 sq ft, 1 ember 1L = 300 sq ft)
        int sisaLuas = (int) Math.ceil(totalLuas); 
        
        int ember5L = sisaLuas / 1500;
        int sisaSetelah5L = sisaLuas % 1500;

        int ember1L = (int) Math.ceil((double) sisaSetelah5L / 300);

        // 4. Hitung total biaya
        double totalBiaya = (ember5L * 15.0) + (ember1L * 4.0);

        // 5. Menampilkan hasil
        System.out.println("--- Rincian Pembelian Cat ---");
        System.out.println("Ember 5 liter (Rp15): " + ember5L + " buah");
        System.out.println("Ember 1 liter (Rp4) : " + ember1L + " buah");
        System.out.println("Total Biaya         : $" + totalBiaya);

        input.close();
    }
}

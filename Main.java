import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Contoh inisialisasi dua kartu awal (misal nilai poin antara 1 s.d. 10)
        int kartu1 = random.nextInt(10) + 1;
        int kartu2 = random.nextInt(10) + 1;
        
        ArrayList<Integer> hand = new ArrayList<>();
        hand.add(kartu1);
        hand.add(kartu2);
        
        int totalPoin = kartu1 + kartu2;
        
        // a. Tampilkan total nilai poin untuk dua kartu acak tersebut
        System.out.println("Kartu awal Anda: " + kartu1 + " dan " + kartu2);
        System.out.println("a. Total nilai poin untuk dua kartu awal: " + totalPoin);
        
        // b. Tanyakan kepada pengguna apakah ingin kartu lagi
        if (totalPoin <= 21) {
            System.out.print("b. Apakah Anda ingin mengambil kartu lagi? (y/n): ");
            String jawaban = scanner.nextLine();
            
            if (jawaban.equalsIgnoreCase("y")) {
                int kartu3 = random.nextInt(10) + 1;
                hand.add(kartu3);
                totalPoin = 0;
                for (int poin : hand) {
                    totalPoin += poin;
                }
                System.out.println("Kartu baru ditambahkan: " + kartu3);
                System.out.println("Poin untuk semua 3 kartu di Hand Anda: " + totalPoin);
            }
        }
        
        // c. Buat loop untuk terus menambahkan kartu hingga kondisi terpenuhi
        // (Melebihi 21, pengguna berhenti, atau jumlah kartu mencapai 5)
        while (totalPoin <= 21 && hand.size() < 5) {
            System.out.print("Ingin menambah kartu lagi? (y/n): ");
            String lanjut = scanner.nextLine();
            
            if (!lanjut.equalsIgnoreCase("y")) {
                break;
            }
            
            int kartuBaru = random.nextInt(10) + 1;
            hand.add(kartuBaru);
            
            totalPoin = 0;
            for (int poin : hand) {
                totalPoin += poin;
            }
            
            System.out.println("Kartu baru: " + kartuBaru);
            System.out.println("Jumlah kartu di Hand: " + hand.size());
            System.out.println("Total poin saat ini: " + totalPoin);
        }
        
        System.out.println("Permainan selesai. Total poin akhir Anda: " + totalPoin);
        scanner.close();
    }
}
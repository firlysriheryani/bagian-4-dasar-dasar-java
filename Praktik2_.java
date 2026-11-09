import java.util.Scanner;

public class Praktik2_{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String decryptedMessage = "";
        
        System.out.println("Masukkan 10 angka rahasia satu per satu (angka yang valid: 1 sampai 7):");
        
        int count = 0;
        while (count < 10) {
            System.out.print("Masukkan angka ke-" + (count + 1) + ": ");
            int angka = scanner.nextInt();
            
            char huruf = ' ';
            boolean valid = true;
            
            // Menggunakan switch untuk memetakan angka ke huruf
            switch (angka) {
                case 1:
                    huruf = 'D';
                    break;
                case 2:
                    huruf = 'W';
                    break;
                case 3:
                    huruf = 'E';
                    break;
                case 4:
                    huruf = 'L';
                    break;
                case 5:
                    huruf = 'H';
                    break;
                case 6:
                    huruf = 'O';
                    break;
                case 7:
                    huruf = 'R';
                    break;
                default:
                    System.out.println("Angka belum terpecahkan! Silakan masukkan angka baru.");
                    valid = false; // Jika tidak valid, perulangan angka ke-n akan diulang
            }
            
            if (valid) {
                decryptedMessage += huruf;
                count++;
            }
        }
        
        // Menampilkan hasil akhir 
        System.out.println("\nPesan rahasia berhasil diuraikan: " + decryptedMessage);
        
        scanner.close();
    }
}
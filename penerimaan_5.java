import java.util.Scanner;

public class penerimaan_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variabel untuk menyimpan input
        boolean isValedictorian = false;
        boolean isSalutatorian = false;
        int classSize = 0;
        double gpa = 0.0;
        int satScore = 0;

        // Meminta input dari pengguna
        System.out.println("Program Seleksi Masuk Valedictorian University");
        
        System.out.print("Apakah Anda seorang Valedictorian? (y/n): ");
        char valChoice = scanner.next().toLowerCase().charAt(0);
        if (valChoice == 'y') {
            isValedictorian = true;
        }

        System.out.print("Apakah Anda seorang Salutatorian? (y/n): ");
        char salChoice = scanner.next().toLowerCase().charAt(0);
        if (salChoice == 'y') {
            isSalutatorian = true;
        }

        System.out.print("Berapa jumlah siswa di sekolah Anda? ");
        classSize = scanner.nextInt();

        System.out.print("Berapa nilai GPA Anda? ");
        gpa = scanner.nextDouble();

        System.out.print("Berapa skor SAT Anda? ");
        satScore = scanner.nextInt();

        // Logika pengecekan menggunakan satu pernyataan if yang digabung dengan operator && dan ||
        boolean diterima = ( (isValedictorian || isSalutatorian) && classSize >= 1400 ) ||
                           ( gpa >= 4.0 && satScore >= 1100 ) ||
                           ( gpa >= 3.5 && satScore >= 1300 ) ||
                           ( gpa >= 3.0 && satScore >= 1500 );

        // Menampilkan hasil
        System.out.println("\n----------------------------------------");
        if (diterima) {
            System.out.println("Selamat! Anda DITERIMA di Valedictorian University.");
        } else {
            System.out.println("Mohon maaf, Anda belum memenuhi kriteria penerimaan.");
        }
        System.out.println("----------------------------------------");

        scanner.close();
    }
}
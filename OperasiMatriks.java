import java.util.Scanner;

public class OperasiMatriks {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matriksA = null;
        int[][] matriksB = null;
        char pilihan;

        do {
            // Menampilkan Menu
            System.out.println("\n=== MENU OPERASI MATRIKS ===");
            System.out.println("a. Masukkan Matriks A");
            System.out.println("b. Masukkan Matriks B");
            System.out.println("c. Tampilkan A + B");
            System.out.println("d. Tampilkan A - B");
            System.out.println("e. Tampilkan A * B");
            System.out.println("f. Keluar");
            System.out.print("Pilih opsi (a-f): ");
            
            pilihan = scanner.next().toLowerCase().charAt(0);

            switch (pilihan) {
                case 'a':
                    matriksA = inputMatriks("A");
                    break;
                case 'b':
                    matriksB = inputMatriks("B");
                    break;
                case 'c':
                    if (cekMatriksSudahDiisi(matriksA, matriksB)) {
                        tambahMatriks(matriksA, matriksB);
                    }
                    break;
                case 'd':
                    if (cekMatriksSudahDiisi(matriksA, matriksB)) {
                        kurangMatriks(matriksA, matriksB);
                    }
                    break;
                case 'e':
                    if (cekMatriksSudahDiisi(matriksA, matriksB)) {
                        kaliMatriks(matriksA, matriksB);
                    }
                    break;
                case 'f':
                    System.out.println("Program selesai. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Masukkan pilihan a - f.");
            }
        } while (pilihan != 'f');
    }

    // Method untuk menginput elemen Matriks (Ukuran 2x2)
    public static int[][] inputMatriks(String namaMatriks) {
        int[][] matriks = new int[2][2];
        System.out.println("\n--- Input Matriks " + namaMatriks + " (2x2) ---");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(namaMatriks + "[" + i + "][" + j + "]: ");
                matriks[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matriks " + namaMatriks + " berhasil disimpan!");
        return matriks;
    }

    // Method untuk mencetak matriks
    public static void cetakMatriks(int[][] matriks) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method untuk mengecek apakah kedua matriks sudah diinput
    public static boolean cekMatriksSudahDiisi(int[][] a, int[][] b) {
        if (a == null || b == null) {
            System.out.println("Peringatan: Harap masukkan Matriks A dan Matriks B terlebih dahulu!");
            return false;
        }
        return true;
    }

    // Method Penjumlahan Matriks (A + B)
    public static void tambahMatriks(int[][] a, int[][] b) {
        int[][] hasil = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("\nHasil A + B:");
        cetakMatriks(hasil);
    }

    // Method Pengurangan Matriks (A - B)
    public static void kurangMatriks(int[][] a, int[][] b) {
        int[][] hasil = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil[i][j] = a[i][j] - b[i][j];
            }
        }
        System.out.println("\nHasil A - B:");
        cetakMatriks(hasil);
    }

    // Method Perkalian Matriks (A * B)
    public static void kaliMatriks(int[][] a, int[][] b) {
        int[][] hasil = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    hasil[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("\nHasil A * B:");
        cetakMatriks(hasil);
    }
}
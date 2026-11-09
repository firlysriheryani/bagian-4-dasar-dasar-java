public class HariDalamSetahun {
    public static void main(String[] args) {
        String[] hari = {
            "Minggu", "Senin", "Selasa", "Rabu",
            "Kamis", "Jumat", "Sabtu"
        };

        for (int i = 0; i < 365; i++) {
            System.out.println("Hari ke-" + (i + 1) + ": " + hari[i % 7]);
        }
    }
} 
import java.util.Scanner;

public class Beratplanet_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Meminta berat badan pengguna di Bumi
        System.out.print("Masukkan berat badan Anda di Bumi (kg): ");
        double beratBumi = input.nextDouble();

        // 2. Menampilkan menu planet
        System.out.println("\nPilih planet tujuan:");
        System.out.println("1. Markurius (0.38)");
        System.out.println("2. Venus(0.91)");
        System.out.println("3. Mars (0. 38)");
        System.out.println("4. Jupiter (2.36)");
        System.out.println("5. Saturnus (0.92)");
        System.out.println("6. Uranus (0. 89)");
        System.out.println("7. Neptunus (1.13)");
        System.out.print("Masukkan pilihan nomor planet (1-7): ");
        int pilihan = input.nextInt();

        double beratPlanet = 0;
        String namaPlanet = "";
        boolean valid = true;

        // 3. Menghitung berat berdasarkan pilihan menggunakan switch
        switch (pilihan) {
            case 1:
                namaPlanet = "Markurius";
                beratPlanet = beratBumi * 0.38;
                break;
            case 2:
                namaPlanet = "Venus";
                beratPlanet = beratBumi * 0.91;
                break;
            case 3:
                namaPlanet = "Mars";
                beratPlanet = beratBumi * 0.38;
                break;
            case 4:
                namaPlanet = "Jupiter";
                beratPlanet = beratBumi * 2.36;
                break;
            case 5:
                namaPlanet = "Saturnus";
                beratPlanet = beratBumi * 0.92;
                break;
            case 6:
                namaPlanet = "Uranus";
                beratPlanet = beratBumi * 0.89;
                break;
            case 7:
                namaPlanet = "Neptunus";
                beratPlanet = beratBumi * 1.13;
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                valid = false;
        }

        // 4. Menampilkan hasil
        if (valid) {
            System.out.println("Berat badan Anda di " + namaPlanet + " adalah " + beratPlanet + " kg");
        }

        input.close();
    }
}
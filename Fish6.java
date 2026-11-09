public class Fish6 {
    // Instance variable
    String typeOfFish;
    int friendliness;

    // 1. Constructor tanpa argumen
    public Fish6() {
        this.typeOfFish = "Unknown";
        this.friendliness = 3;
    }

    // 2. Constructor dengan parameter
    public Fish6(String t, int f) {
        this.typeOfFish = t;
        this.friendliness = f;
    }

    // Method getFriendliness
    public int getFriendliness() {
        return this.friendliness;
    }

    // Method nicestFish untuk membandingkan dua ikan
    public static Fish6 nicestFish(Fish6 fish1, Fish6 fish2) {
        if (fish1.getFriendliness() > fish2.getFriendliness()) {
            return fish1;
        } else {
            return fish2;
        }
    }

    // Main method untuk pengujian
    public static void main(String[] args) {
        // Inisialisasi 2 ikan dari soal sebelumnya
        Fish6 ikan1 = new Fish6("AngelFish", 5); // Amber (sangat ramah)
        Fish6 ikan2 = new Fish6("Guppy", 3);     // James (netral)

        // Menguji method nicestFish
        Fish6 ikanPalingRamah = nicestFish(ikan1, ikan2);

        // Menampilkan hasil
        System.out.println("Ikan 1: " + ikan1.typeOfFish + " (Keramahan: " + ikan1.getFriendliness() + ")");
        System.out.println("Ikan 2: " + ikan2.typeOfFish + " (Keramahan: " + ikan2.getFriendliness() + ")");
        System.out.println("---------------------------------------------------");
        System.out.println("Ikan yang paling ramah adalah: " + ikanPalingRamah.typeOfFish + 
                           " dengan tingkat keramahan " + ikanPalingRamah.getFriendliness());
    }
}

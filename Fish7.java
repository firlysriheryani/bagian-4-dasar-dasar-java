 public class Fish7 {
    // Instance variable
    String typeOfFish;
    int friendliness;

    // 1. Constructor tanpa argumen
    public Fish7() {
        this.typeOfFish = "Unknown";
        this.friendliness = 3;
    }

    // 2. Constructor dengan parameter
    public Fish7(String t, int f) {
        this.typeOfFish = t;
        this.friendliness = f;
    }

    // Method getFriendliness
    public int getFriendliness() {
        return this.friendliness;
    }

    // Modifikasi method nicestFish menjadi variable argument method (Fish...)
    public static Fish7 nicestFish(Fish7... fishes) {
        if (fishes.length == 0) {
            return null; // Mengembalikan null jika tidak ada ikan yang dimasukkan
        }

        // Atur temp sama dengan ikan pertama
        Fish7 temp = fishes[0];

        // Gunakan for loop untuk menelusuri semua ikan
        for (Fish7 fish : fishes) {
            // Jika menemukan ikan yang lebih ramah dari temp, update temp
            if (fish.getFriendliness() > temp.getFriendliness()) {
                temp = fish;
            }
        }

        // Kembalikan temp (ikan yang paling ramah)
        return temp;
    }

    // Main method untuk pengujian
    public static void main(String[] args) {
        // Inisialisasi beberapa ikan untuk pengujian
        Fish7 ikan1 = new Fish7("AngelFish", 5); // Sangat ramah
        Fish7 ikan2 = new Fish7("Guppy", 3);     // Netral
        Fish7 ikan3 = new Fish7("Piranha", 1);   // Galak
        Fish7 ikan4 = new Fish7("Goldfish", 4);  // Ramah

        // Menguji method nicestFish dengan banyak ikan sekaligus
        Fish7 ikanPalingRamah = nicestFish(ikan1, ikan2, ikan3, ikan4);

        // Menampilkan hasil
        System.out.println("Ikan yang paling ramah dari daftar adalah: " + 
                           ikanPalingRamah.typeOfFish + 
                           " dengan tingkat keramahan " + 
                           ikanPalingRamah.getFriendliness());
    }
}

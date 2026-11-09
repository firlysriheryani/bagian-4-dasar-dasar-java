public class Fish5 {
    // Instance variable
    String typeOfFish;
    int friendliness;

    // 1. Constructor tanpa argumen
    public Fish5() {
        this.typeOfFish = "Unknown";
        this.friendliness = 3;
    }

    // 2. Constructor dengan parameter
    public Fish5(String t, int f) {
        this.typeOfFish = t;
        this.friendliness = f;
    }

    // Method getFriendliness untuk mengembalikan tingkat keramahan
    public int getFriendliness() {
        return this.friendliness;
    }

    // Main method untuk menjalankan program dan menginisialisasi ikan
    public static void main(String[] args) {
        // a. Ikan 1: Jenis – AngelFish, Tingkat Keramahan – 5 (Catatan: Nama "Amber" bisa diabaikan atau disesuaikan jika class hanya punya typeOfFish)
        Fish5 ikan1 = new Fish5("AngelFish", 5);

        // b. Ikan 2: Jenis – Guppy, Tingkat Keramahan – 3 (Nama "James")
        Fish5 ikan2 = new Fish5("Guppy", 3);

        // Menampilkan hasil untuk memastikan kode berjalan dengan baik
        System.out.println("Ikan 1 (Amber): " + ikan1.typeOfFish + " | Keramahan: " + ikan1.getFriendliness());
        System.out.println("Ikan 2 (James): " + ikan2.typeOfFish + " | Keramahan: " + ikan2.getFriendliness());
    }
}
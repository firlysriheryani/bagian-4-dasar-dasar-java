
 public class Fish3 {
    // Instance variable
    String typeOfFish;
    int friendliness;

    // 1. Constructor tanpa argumen (dari soal sebelumnya)
    public Fish3() {
        this.typeOfFish = "Unknown";
        this.friendliness = 3;
    }

    // 2. Constructor dengan parameter (sesuai permintaan baru)
    public Fish3(String t, int f) {
        this.typeOfFish = t;
        this.friendliness = f;
    }

    // Main method untuk pengujian
    public static void main(String[] args) {
        // Menguji constructor default
        Fish3 ikanDefault = new Fish3();
        System.out.println("Ikan 1 -> Jenis: " + ikanDefault.typeOfFish + ", Keramahan: " + ikanDefault.friendliness);

        // Menguji constructor dengan parameter
        Fish3 ikanCustom = new Fish3("Ikan Badut", 8);
        System.out.println("Ikan 2 -> Jenis: " + ikanCustom.typeOfFish + ", Keramahan: " + ikanCustom.friendliness);
    }
 }
public class Fish2 {
    // Instance variable
    String typeOfFish;
    int friendliness;

    // Constructor tanpa argumen sesuai permintaan
    public Fish2() {
        this.typeOfFish = "Unknown";
        this.friendliness = 3;
    }

    // Main method untuk pengujian (opsional untuk dijalankan)
    public static void main(String[] args) {
        Fish2 defaultFish = new Fish2();
        
        System.out.println("Jenis Ikan: " + defaultFish.typeOfFish);
        System.out.println("Tingkat Keramahan: " + defaultFish.friendliness);
    }
}
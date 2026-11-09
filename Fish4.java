public class Fish4 {
    // Instance variable
    String typeOfFish;
    int friendliness;

    // Constructor tanpa argumen
    public Fish4() {
        this.typeOfFish = "Unknown";
        this.friendliness = 3;
    }

    // Constructor dengan parameter
    public Fish4(String t, int f) {
        this.typeOfFish = t;
        this.friendliness = f;
    }

    // Method getFriendliness untuk mengembalikan tingkat keramahan
    public int getFriendliness() {
        return this.friendliness;
    }

    // Main method untuk pengujian
    public static void main(String[] args) {
        Fish4 ikanku = new Fish4("Ikan Mas", 7);
        
        // Memanggil method getFriendliness()
        System.out.println("Tingkat keramahan: " + ikanku.getFriendliness());
    }
}
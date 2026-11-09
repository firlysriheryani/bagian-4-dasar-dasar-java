public class Animal {
    int weight, height;
    double speed;

    // Constructor pertama
    Animal() {
        weight = 50;
        height = 4;
        speed = 2; // miles per hour
    }

    // Constructor kedua
    Animal(int w, int h, int s) {
        weight = w;
        height = h;
        speed = s;
    }

    // Method getter yang sudah ada
    public double getTime(double miles) { 
        return miles / speed;
    }

    public int getWeight() { 
        return weight; 
    }

    public int getHeight() { 
        return height; 
    }

    // TAMBAHKAN INI: Method getSpeed() yang tadinya kurang
    public double getSpeed() {
        return speed;
    }

    // Method main untuk menjalankan program
    public static void main(String[] args) {
        // Membuat 2 instance (objek) dari class Animal
        Animal animal1 = new Animal();
        Animal animal2 = new Animal(60, 5, 4);

        // Mencetak kecepatan sesuai format soal
        System.out.println("a. Animal #1 memiliki kecepatan " + animal1.getSpeed() + ".");
        System.out.println("b. Animal #2 memiliki kecepatan " + animal2.getSpeed() + ".");
    }
}
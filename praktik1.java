public class praktik1 {
    // Instance variables
    private String name;
    private int credits;
    private double gpa;
    private double qualityPoints;

    // Constructor
    public praktik1(String name, int credits, double gpa, double qualityPoints) {
        this.name = name;
        this.credits = credits;
        this.gpa = gpa;
        this.qualityPoints = qualityPoints;
    }

    // Method menghitung IP/GPA
    public double calculateGPA() {
        if (credits == 0) {
            return 0.0;
        }
        return qualityPoints / credits;
    }

    // Method memperbarui kredit, poin mutu, dan IP
    public void addCourse(int newCredits, double newQualityPoints) {
        this.credits += newCredits;
        this.qualityPoints += newQualityPoints;
        if (this.credits > 0) {
            this.gpa = (double) this.qualityPoints / this.credits;
        }
    }

    // Method Getter
    public String getName() { 
        return name; 
    }

    public int getCredits() { 
        return credits; 
    }

    public double getQualityPoints() { 
        return qualityPoints; 
    }

    public static void main(String[] args) {
        // Membuat 3 instance sesuai tabel
        praktik1 mary = new praktik1("Mary Jones", 14, 0.0, 46.0);
        praktik1 john = new praktik1("John Stiner", 60, 0.0, 173.0);
        praktik1 ari  =  new  praktik1("Ari Samala", 31, 0.0, 69.0);

        System.out.println("=== DATA ARI SAMALA (SEBELUM UPDATE) ===");
        System.out.println("Nama       : " + ari.getName());
        System.out.println("Kredit     : " + ari.getCredits());
        System.out.println("Poin Mutu  : " + ari.getQualityPoints());
        System.out.println("IP (GPA)   : " + ari.calculateGPA());

        // Menambahkan 13 kredit dan 52 poin mutu ke Ari Samala
        ari.addCourse(13, 52.0);

        System.out.println("\n=== DATA ARI SAMALA (SETELAH UPDATE) ===");
        System.out.println("Nama       : " + ari.getName());
        System.out.println("Kredit Baru: " + ari.getCredits());
        System.out.println("Poin Baru  : " + ari.getQualityPoints());
        System.out.println("IP Baru    : " + ari.calculateGPA());
    }
}